// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryGateVerifyStatisticPublicRequest} extends {@link RequestModel}
 *
 * <p>QueryGateVerifyStatisticPublicRequest</p>
 */
public class QueryGateVerifyStatisticPublicRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthenticationType")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 99)
    private Integer authenticationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OsType")
    private String osType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneCode")
    private String sceneCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startDate;

    private QueryGateVerifyStatisticPublicRequest(Builder builder) {
        super(builder);
        this.authenticationType = builder.authenticationType;
        this.endDate = builder.endDate;
        this.osType = builder.osType;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.sceneCode = builder.sceneCode;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryGateVerifyStatisticPublicRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authenticationType
     */
    public Integer getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return osType
     */
    public String getOsType() {
        return this.osType;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return sceneCode
     */
    public String getSceneCode() {
        return this.sceneCode;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<QueryGateVerifyStatisticPublicRequest, Builder> {
        private Integer authenticationType; 
        private String endDate; 
        private String osType; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private String sceneCode; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(QueryGateVerifyStatisticPublicRequest request) {
            super(request);
            this.authenticationType = request.authenticationType;
            this.endDate = request.endDate;
            this.osType = request.osType;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.sceneCode = request.sceneCode;
            this.startDate = request.startDate;
        } 

        /**
         * <p>The verification method. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: one-click logon</li>
         * <li><strong>2</strong>: phone number verification, including the verification of the phone number used in HTML5 pages</li>
         * <li><strong>3</strong>: SMS verification</li>
         * <li><strong>4</strong>: facial recognition</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder authenticationType(Integer authenticationType) {
            this.putQueryParameter("AuthenticationType", authenticationType);
            this.authenticationType = authenticationType;
            return this;
        }

        /**
         * <p>The end date. Specify this parameter in the YYYYMMDD format. Example: 20220106.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20220106</p>
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>The type of the operating system. Valid values:</p>
         * <ul>
         * <li><strong>Android</strong></li>
         * <li><strong>iOS</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Android</p>
         */
        public Builder osType(String osType) {
            this.putQueryParameter("OsType", osType);
            this.osType = osType;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * <p>The service code.</p>
         * 
         * <strong>example:</strong>
         * <p>FC100000038194004</p>
         */
        public Builder sceneCode(String sceneCode) {
            this.putQueryParameter("SceneCode", sceneCode);
            this.sceneCode = sceneCode;
            return this;
        }

        /**
         * <p>The start date. Specify this parameter in the YYYYMMDD format. Example: 20220101.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20220101</p>
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public QueryGateVerifyStatisticPublicRequest build() {
            return new QueryGateVerifyStatisticPublicRequest(this);
        } 

    } 

}
