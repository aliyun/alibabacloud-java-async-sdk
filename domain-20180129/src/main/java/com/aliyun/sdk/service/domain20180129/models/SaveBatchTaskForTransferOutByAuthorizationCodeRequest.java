// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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
 * {@link SaveBatchTaskForTransferOutByAuthorizationCodeRequest} extends {@link RequestModel}
 *
 * <p>SaveBatchTaskForTransferOutByAuthorizationCodeRequest</p>
 */
public class SaveBatchTaskForTransferOutByAuthorizationCodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransferOutParamList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<TransferOutParamList> transferOutParamList;

    private SaveBatchTaskForTransferOutByAuthorizationCodeRequest(Builder builder) {
        super(builder);
        this.transferOutParamList = builder.transferOutParamList;
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
     * @return transferOutParamList
     */
    public java.util.List<TransferOutParamList> getTransferOutParamList() {
        return this.transferOutParamList;
    }

    public static final class Builder extends Request.Builder<SaveBatchTaskForTransferOutByAuthorizationCodeRequest, Builder> {
        private java.util.List<TransferOutParamList> transferOutParamList; 

        private Builder() {
            super();
        } 

        private Builder(SaveBatchTaskForTransferOutByAuthorizationCodeRequest request) {
            super(request);
            this.transferOutParamList = request.transferOutParamList;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder transferOutParamList(java.util.List<TransferOutParamList> transferOutParamList) {
            this.putQueryParameter("TransferOutParamList", transferOutParamList);
            this.transferOutParamList = transferOutParamList;
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

            private Builder() {
            } 

            private Builder(TransferOutParamList model) {
                this.authorizationCode = model.authorizationCode;
                this.domainName = model.domainName;
            } 

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
