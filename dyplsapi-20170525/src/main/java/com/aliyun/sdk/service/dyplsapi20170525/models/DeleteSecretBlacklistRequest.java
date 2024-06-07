// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSecretBlacklistRequest} extends {@link RequestModel}
 *
 * <p>DeleteSecretBlacklistRequest</p>
 */
public class DeleteSecretBlacklistRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BlackNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String blackNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BlackType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String blackType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PoolKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String poolKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WayControl")
    private String wayControl;

    private DeleteSecretBlacklistRequest(Builder builder) {
        super(builder);
        this.blackNo = builder.blackNo;
        this.blackType = builder.blackType;
        this.poolKey = builder.poolKey;
        this.remark = builder.remark;
        this.wayControl = builder.wayControl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSecretBlacklistRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return blackNo
     */
    public String getBlackNo() {
        return this.blackNo;
    }

    /**
     * @return blackType
     */
    public String getBlackType() {
        return this.blackType;
    }

    /**
     * @return poolKey
     */
    public String getPoolKey() {
        return this.poolKey;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return wayControl
     */
    public String getWayControl() {
        return this.wayControl;
    }

    public static final class Builder extends Request.Builder<DeleteSecretBlacklistRequest, Builder> {
        private String blackNo; 
        private String blackType; 
        private String poolKey; 
        private String remark; 
        private String wayControl; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSecretBlacklistRequest request) {
            super(request);
            this.blackNo = request.blackNo;
            this.blackType = request.blackType;
            this.poolKey = request.poolKey;
            this.remark = request.remark;
            this.wayControl = request.wayControl;
        } 

        /**
         * The phone numbers in the blacklist. A point-to-point blacklist has a pair of numbers separated by a colon (":"). A number pool blacklist or a platform blacklist has only one single number.
         */
        public Builder blackNo(String blackNo) {
            this.putQueryParameter("BlackNo", blackNo);
            this.blackNo = blackNo;
            return this;
        }

        /**
         * The blacklist type. Valid values:
         * <p>
         * 
         * *   **POINT_TO_POINT_BLACK**: point-to-point blacklist
         * *   **PARTNER_GLOBAL_NUMBER_BLACK**: number pool blacklist
         */
        public Builder blackType(String blackType) {
            this.putQueryParameter("BlackType", blackType);
            this.blackType = blackType;
            return this;
        }

        /**
         * The key of the phone number pool. Log on to the [Phone Number Protection console](https://dypls.console.aliyun.com/dypls.htm#/account) and view the key of the phone number pool on the **Number Pool Management** page.
         */
        public Builder poolKey(String poolKey) {
            this.putQueryParameter("PoolKey", poolKey);
            this.poolKey = poolKey;
            return this;
        }

        /**
         * The remarks for the blacklist.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * The control on the call direction.
         * <p>
         * 
         * *   **PHONEA_REJECT**: The first phone number in the blacklist can be used to call the second phone number, but the second phone number in the blacklist cannot be used to call the first phone number.
         * *   **PHONEB_REJECT**: The first phone number in the blacklist cannot be used to call the second phone number, but the second phone number in the blacklist can be used to call the first phone number.
         * *   If this parameter is not specified, the two phone numbers in the blacklist cannot be used to call each other.
         * 
         * Valid values:
         * 
         * *   DUPLEX_REJECT
         * *   PHONEA_REJECT
         * *   PHONEB_REJECT
         */
        public Builder wayControl(String wayControl) {
            this.putQueryParameter("WayControl", wayControl);
            this.wayControl = wayControl;
            return this;
        }

        @Override
        public DeleteSecretBlacklistRequest build() {
            return new DeleteSecretBlacklistRequest(this);
        } 

    } 

}
