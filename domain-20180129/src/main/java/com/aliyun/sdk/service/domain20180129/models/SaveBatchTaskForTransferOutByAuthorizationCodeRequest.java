// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SaveBatchTaskForTransferOutByAuthorizationCodeRequest} extends {@link RequestModel}
 *
 * <p>SaveBatchTaskForTransferOutByAuthorizationCodeRequest</p>
 */
public class SaveBatchTaskForTransferOutByAuthorizationCodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Long")
    private String _long;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransferOutParamList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < TransferOutParamList> transferOutParamList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private SaveBatchTaskForTransferOutByAuthorizationCodeRequest(Builder builder) {
        super(builder);
        this._long = builder._long;
        this.transferOutParamList = builder.transferOutParamList;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveBatchTaskForTransferOutByAuthorizationCodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return _long
     */
    public String get_long() {
        return this._long;
    }

    /**
     * @return transferOutParamList
     */
    public java.util.List < TransferOutParamList> getTransferOutParamList() {
        return this.transferOutParamList;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<SaveBatchTaskForTransferOutByAuthorizationCodeRequest, Builder> {
        private String _long; 
        private java.util.List < TransferOutParamList> transferOutParamList; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(SaveBatchTaskForTransferOutByAuthorizationCodeRequest request) {
            super(request);
            this._long = request._long;
            this.transferOutParamList = request.transferOutParamList;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * Long.
         */
        public Builder _long(String _long) {
            this.putQueryParameter("Long", _long);
            this._long = _long;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder transferOutParamList(java.util.List < TransferOutParamList> transferOutParamList) {
            this.putQueryParameter("TransferOutParamList", transferOutParamList);
            this.transferOutParamList = transferOutParamList;
            return this;
        }

        /**
         * UserClientIp.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public SaveBatchTaskForTransferOutByAuthorizationCodeRequest build() {
            return new SaveBatchTaskForTransferOutByAuthorizationCodeRequest(this);
        } 

    } 

    /**
     * 
     * {@link SaveBatchTaskForTransferOutByAuthorizationCodeRequest} extends {@link TeaModel}
     *
     * <p>SaveBatchTaskForTransferOutByAuthorizationCodeRequest</p>
     */
    public static class TransferOutParamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizationCode")
        private String authorizationCode;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        private TransferOutParamList(Builder builder) {
            this.authorizationCode = builder.authorizationCode;
            this.domainName = builder.domainName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferOutParamList create() {
            return builder().build();
        }

        /**
         * @return authorizationCode
         */
        public String getAuthorizationCode() {
            return this.authorizationCode;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        public static final class Builder {
            private String authorizationCode; 
            private String domainName; 

            /**
             * AuthorizationCode.
             */
            public Builder authorizationCode(String authorizationCode) {
                this.authorizationCode = authorizationCode;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            public TransferOutParamList build() {
                return new TransferOutParamList(this);
            } 

        } 

    }
}
