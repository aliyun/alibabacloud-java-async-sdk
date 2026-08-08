// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bdrc20230808.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateCrossAccountsRequest} extends {@link RequestModel}
 *
 * <p>UpdateCrossAccountsRequest</p>
 */
public class UpdateCrossAccountsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateTargets")
    private java.util.List<CreateTargets> createTargets;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeleteTargets")
    private java.util.List<DeleteTargets> deleteTargets;

    private UpdateCrossAccountsRequest(Builder builder) {
        super(builder);
        this.createTargets = builder.createTargets;
        this.deleteTargets = builder.deleteTargets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCrossAccountsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTargets
     */
    public java.util.List<CreateTargets> getCreateTargets() {
        return this.createTargets;
    }

    /**
     * @return deleteTargets
     */
    public java.util.List<DeleteTargets> getDeleteTargets() {
        return this.deleteTargets;
    }

    public static final class Builder extends Request.Builder<UpdateCrossAccountsRequest, Builder> {
        private java.util.List<CreateTargets> createTargets; 
        private java.util.List<DeleteTargets> deleteTargets; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCrossAccountsRequest request) {
            super(request);
            this.createTargets = request.createTargets;
            this.deleteTargets = request.deleteTargets;
        } 

        /**
         * CreateTargets.
         */
        public Builder createTargets(java.util.List<CreateTargets> createTargets) {
            String createTargetsShrink = shrink(createTargets, "CreateTargets", "json");
            this.putBodyParameter("CreateTargets", createTargetsShrink);
            this.createTargets = createTargets;
            return this;
        }

        /**
         * DeleteTargets.
         */
        public Builder deleteTargets(java.util.List<DeleteTargets> deleteTargets) {
            String deleteTargetsShrink = shrink(deleteTargets, "DeleteTargets", "json");
            this.putBodyParameter("DeleteTargets", deleteTargetsShrink);
            this.deleteTargets = deleteTargets;
            return this;
        }

        @Override
        public UpdateCrossAccountsRequest build() {
            return new UpdateCrossAccountsRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateCrossAccountsRequest} extends {@link TeaModel}
     *
     * <p>UpdateCrossAccountsRequest</p>
     */
    public static class CreateTargets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TargetId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String targetId;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String targetType;

        private CreateTargets(Builder builder) {
            this.targetId = builder.targetId;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateTargets create() {
            return builder().build();
        }

        /**
         * @return targetId
         */
        public String getTargetId() {
            return this.targetId;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private String targetId; 
            private String targetType; 

            private Builder() {
            } 

            private Builder(CreateTargets model) {
                this.targetId = model.targetId;
                this.targetType = model.targetType;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>123***7890</p>
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ACCOUNT</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            public CreateTargets build() {
                return new CreateTargets(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateCrossAccountsRequest} extends {@link TeaModel}
     *
     * <p>UpdateCrossAccountsRequest</p>
     */
    public static class DeleteTargets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TargetId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String targetId;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String targetType;

        private DeleteTargets(Builder builder) {
            this.targetId = builder.targetId;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeleteTargets create() {
            return builder().build();
        }

        /**
         * @return targetId
         */
        public String getTargetId() {
            return this.targetId;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private String targetId; 
            private String targetType; 

            private Builder() {
            } 

            private Builder(DeleteTargets model) {
                this.targetId = model.targetId;
                this.targetType = model.targetType;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>123***7890</p>
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ACCOUNT</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            public DeleteTargets build() {
                return new DeleteTargets(this);
            } 

        } 

    }
}
