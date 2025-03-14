// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetBackupAutoConfigStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetBackupAutoConfigStatusResponseBody</p>
 */
public class GetBackupAutoConfigStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetBackupAutoConfigStatusResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBackupAutoConfigStatusResponseBody create() {
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

        private Builder(GetBackupAutoConfigStatusResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response parameters.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>898F7AA7-CECD-5EC7-AF4D-664C601B****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetBackupAutoConfigStatusResponseBody build() {
            return new GetBackupAutoConfigStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetBackupAutoConfigStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetBackupAutoConfigStatusResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanConfigAuto")
        private Boolean canConfigAuto;

        private Data(Builder builder) {
            this.canConfigAuto = builder.canConfigAuto;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return canConfigAuto
         */
        public Boolean getCanConfigAuto() {
            return this.canConfigAuto;
        }

        public static final class Builder {
            private Boolean canConfigAuto; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.canConfigAuto = model.canConfigAuto;
            } 

            /**
             * <p>Indicates whether the anti-ransomware policy for servers can be automatically configured by the managed anti-ransomware feature. Valid values:</p>
             * <ul>
             * <li><strong>false</strong></li>
             * <li><strong>true</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder canConfigAuto(Boolean canConfigAuto) {
                this.canConfigAuto = canConfigAuto;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
