// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link DeleteStandardRelationsRequest} extends {@link RequestModel}
 *
 * <p>DeleteStandardRelationsRequest</p>
 */
public class DeleteStandardRelationsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeleteCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private DeleteCommand deleteCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private DeleteStandardRelationsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.deleteCommand = builder.deleteCommand;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteStandardRelationsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return deleteCommand
     */
    public DeleteCommand getDeleteCommand() {
        return this.deleteCommand;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static final class Builder extends Request.Builder<DeleteStandardRelationsRequest, Builder> {
        private String regionId; 
        private DeleteCommand deleteCommand; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteStandardRelationsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.deleteCommand = request.deleteCommand;
            this.opTenantId = request.opTenantId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder deleteCommand(DeleteCommand deleteCommand) {
            String deleteCommandShrink = shrink(deleteCommand, "DeleteCommand", "json");
            this.putBodyParameter("DeleteCommand", deleteCommandShrink);
            this.deleteCommand = deleteCommand;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        @Override
        public DeleteStandardRelationsRequest build() {
            return new DeleteStandardRelationsRequest(this);
        } 

    } 

    /**
     * 
     * {@link DeleteStandardRelationsRequest} extends {@link TeaModel}
     *
     * <p>DeleteStandardRelationsRequest</p>
     */
    public static class StandardRefList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StandardId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long standardId;

        private StandardRefList(Builder builder) {
            this.standardId = builder.standardId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StandardRefList create() {
            return builder().build();
        }

        /**
         * @return standardId
         */
        public Long getStandardId() {
            return this.standardId;
        }

        public static final class Builder {
            private Long standardId; 

            private Builder() {
            } 

            private Builder(StandardRefList model) {
                this.standardId = model.standardId;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder standardId(Long standardId) {
                this.standardId = standardId;
                return this;
            }

            public StandardRefList build() {
                return new StandardRefList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DeleteStandardRelationsRequest} extends {@link TeaModel}
     *
     * <p>DeleteStandardRelationsRequest</p>
     */
    public static class DeleteCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RelationType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String relationType;

        @com.aliyun.core.annotation.NameInMap("StandardId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long standardId;

        @com.aliyun.core.annotation.NameInMap("StandardRefList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<StandardRefList> standardRefList;

        private DeleteCommand(Builder builder) {
            this.relationType = builder.relationType;
            this.standardId = builder.standardId;
            this.standardRefList = builder.standardRefList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeleteCommand create() {
            return builder().build();
        }

        /**
         * @return relationType
         */
        public String getRelationType() {
            return this.relationType;
        }

        /**
         * @return standardId
         */
        public Long getStandardId() {
            return this.standardId;
        }

        /**
         * @return standardRefList
         */
        public java.util.List<StandardRefList> getStandardRefList() {
            return this.standardRefList;
        }

        public static final class Builder {
            private String relationType; 
            private Long standardId; 
            private java.util.List<StandardRefList> standardRefList; 

            private Builder() {
            } 

            private Builder(DeleteCommand model) {
                this.relationType = model.relationType;
                this.standardId = model.standardId;
                this.standardRefList = model.standardRefList;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>RELATIVE</p>
             */
            public Builder relationType(String relationType) {
                this.relationType = relationType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder standardId(Long standardId) {
                this.standardId = standardId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder standardRefList(java.util.List<StandardRefList> standardRefList) {
                this.standardRefList = standardRefList;
                return this;
            }

            public DeleteCommand build() {
                return new DeleteCommand(this);
            } 

        } 

    }
}
