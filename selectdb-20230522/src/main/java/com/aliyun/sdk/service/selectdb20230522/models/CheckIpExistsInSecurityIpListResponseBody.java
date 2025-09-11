// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.selectdb20230522.models;

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
 * {@link CheckIpExistsInSecurityIpListResponseBody} extends {@link TeaModel}
 *
 * <p>CheckIpExistsInSecurityIpListResponseBody</p>
 */
public class CheckIpExistsInSecurityIpListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckIpExistsInSecurityIpListResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckIpExistsInSecurityIpListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CheckIpExistsInSecurityIpListResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>4773E4EC-025D-509F-AEA9-D53123FDFB0F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckIpExistsInSecurityIpListResponseBody build() {
            return new CheckIpExistsInSecurityIpListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CheckIpExistsInSecurityIpListResponseBody} extends {@link TeaModel}
     *
     * <p>CheckIpExistsInSecurityIpListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpExists")
        private Boolean ipExists;

        private Data(Builder builder) {
            this.ipExists = builder.ipExists;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return ipExists
         */
        public Boolean getIpExists() {
            return this.ipExists;
        }

        public static final class Builder {
            private Boolean ipExists; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.ipExists = model.ipExists;
            } 

            /**
             * IpExists.
             */
            public Builder ipExists(Boolean ipExists) {
                this.ipExists = ipExists;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
