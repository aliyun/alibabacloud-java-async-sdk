// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link AttachReviewersToReviewRuleRequest} extends {@link RequestModel}
 *
 * <p>AttachReviewersToReviewRuleRequest</p>
 */
public class AttachReviewersToReviewRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Principals")
    private java.util.List<Principals> principals;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReviewRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long reviewRuleId;

    private AttachReviewersToReviewRuleRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.principals = builder.principals;
        this.regionId = builder.regionId;
        this.reviewRuleId = builder.reviewRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachReviewersToReviewRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return principals
     */
    public java.util.List<Principals> getPrincipals() {
        return this.principals;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return reviewRuleId
     */
    public Long getReviewRuleId() {
        return this.reviewRuleId;
    }

    public static final class Builder extends Request.Builder<AttachReviewersToReviewRuleRequest, Builder> {
        private String instanceId; 
        private java.util.List<Principals> principals; 
        private String regionId; 
        private Long reviewRuleId; 

        private Builder() {
            super();
        } 

        private Builder(AttachReviewersToReviewRuleRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.principals = request.principals;
            this.regionId = request.regionId;
            this.reviewRuleId = request.reviewRuleId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-7mz2ve7h00a</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Principals.
         */
        public Builder principals(java.util.List<Principals> principals) {
            this.putQueryParameter("Principals", principals);
            this.principals = principals;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder reviewRuleId(Long reviewRuleId) {
            this.putQueryParameter("ReviewRuleId", reviewRuleId);
            this.reviewRuleId = reviewRuleId;
            return this;
        }

        @Override
        public AttachReviewersToReviewRuleRequest build() {
            return new AttachReviewersToReviewRuleRequest(this);
        } 

    } 

    /**
     * 
     * {@link AttachReviewersToReviewRuleRequest} extends {@link TeaModel}
     *
     * <p>AttachReviewersToReviewRuleRequest</p>
     */
    public static class Principals extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrincipalId")
        private String principalId;

        @com.aliyun.core.annotation.NameInMap("PrincipalName")
        private String principalName;

        @com.aliyun.core.annotation.NameInMap("PrincipalType")
        private String principalType;

        private Principals(Builder builder) {
            this.principalId = builder.principalId;
            this.principalName = builder.principalName;
            this.principalType = builder.principalType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Principals create() {
            return builder().build();
        }

        /**
         * @return principalId
         */
        public String getPrincipalId() {
            return this.principalId;
        }

        /**
         * @return principalName
         */
        public String getPrincipalName() {
            return this.principalName;
        }

        /**
         * @return principalType
         */
        public String getPrincipalType() {
            return this.principalType;
        }

        public static final class Builder {
            private String principalId; 
            private String principalName; 
            private String principalType; 

            private Builder() {
            } 

            private Builder(Principals model) {
                this.principalId = model.principalId;
                this.principalName = model.principalName;
                this.principalType = model.principalType;
            } 

            /**
             * PrincipalId.
             */
            public Builder principalId(String principalId) {
                this.principalId = principalId;
                return this;
            }

            /**
             * PrincipalName.
             */
            public Builder principalName(String principalName) {
                this.principalName = principalName;
                return this;
            }

            /**
             * PrincipalType.
             */
            public Builder principalType(String principalType) {
                this.principalType = principalType;
                return this;
            }

            public Principals build() {
                return new Principals(this);
            } 

        } 

    }
}
