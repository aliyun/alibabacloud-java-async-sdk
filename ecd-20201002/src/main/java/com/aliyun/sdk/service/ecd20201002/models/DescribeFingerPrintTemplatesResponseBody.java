// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

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
 * {@link DescribeFingerPrintTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFingerPrintTemplatesResponseBody</p>
 */
public class DescribeFingerPrintTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FingerPrintTemplates")
    private java.util.List<FingerPrintTemplates> fingerPrintTemplates;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeFingerPrintTemplatesResponseBody(Builder builder) {
        this.fingerPrintTemplates = builder.fingerPrintTemplates;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFingerPrintTemplatesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fingerPrintTemplates
     */
    public java.util.List<FingerPrintTemplates> getFingerPrintTemplates() {
        return this.fingerPrintTemplates;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<FingerPrintTemplates> fingerPrintTemplates; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeFingerPrintTemplatesResponseBody model) {
            this.fingerPrintTemplates = model.fingerPrintTemplates;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The fingerprint templates.</p>
         */
        public Builder fingerPrintTemplates(java.util.List<FingerPrintTemplates> fingerPrintTemplates) {
            this.fingerPrintTemplates = fingerPrintTemplates;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9C1D3FBE-84E1-5ABB-AD98-2003AC71****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeFingerPrintTemplatesResponseBody build() {
            return new DescribeFingerPrintTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFingerPrintTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFingerPrintTemplatesResponseBody</p>
     */
    public static class FingerPrintTemplates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EndUserId")
        private String endUserId;

        @com.aliyun.core.annotation.NameInMap("Index")
        private Long index;

        @com.aliyun.core.annotation.NameInMap("LoginTime")
        private String loginTime;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
        private String officeSiteId;

        private FingerPrintTemplates(Builder builder) {
            this.clientId = builder.clientId;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.endUserId = builder.endUserId;
            this.index = builder.index;
            this.loginTime = builder.loginTime;
            this.officeSiteId = builder.officeSiteId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FingerPrintTemplates create() {
            return builder().build();
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        /**
         * @return index
         */
        public Long getIndex() {
            return this.index;
        }

        /**
         * @return loginTime
         */
        public String getLoginTime() {
            return this.loginTime;
        }

        /**
         * @return officeSiteId
         */
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public static final class Builder {
            private String clientId; 
            private String creationTime; 
            private String description; 
            private String endUserId; 
            private Long index; 
            private String loginTime; 
            private String officeSiteId; 

            private Builder() {
            } 

            private Builder(FingerPrintTemplates model) {
                this.clientId = model.clientId;
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.endUserId = model.endUserId;
                this.index = model.index;
                this.loginTime = model.loginTime;
                this.officeSiteId = model.officeSiteId;
            } 

            /**
             * <p>The client ID. The system generates a unique ID for each client.</p>
             * 
             * <strong>example:</strong>
             * <p>2258a3d5-b8f8-4d79-a221-eaecf211****</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>The time when the template was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-13T13:26:29Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>Finger 1</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>liming</p>
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * <p>The index.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder index(Long index) {
                this.index = index;
                return this;
            }

            /**
             * <p>The logon time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-13T13:26:29Z</p>
             */
            public Builder loginTime(String loginTime) {
                this.loginTime = loginTime;
                return this;
            }

            /**
             * <p>The office network ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou+dir-074949****</p>
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            public FingerPrintTemplates build() {
                return new FingerPrintTemplates(this);
            } 

        } 

    }
}
