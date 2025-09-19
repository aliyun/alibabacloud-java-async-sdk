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
 * {@link GetCommonSwitchConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetCommonSwitchConfigResponseBody</p>
 */
public class GetCommonSwitchConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetCommonSwitchConfigResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCommonSwitchConfigResponseBody create() {
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

        private Builder(GetCommonSwitchConfigResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>24A20733-10A0-4AF6-BE6B-E3322413****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCommonSwitchConfigResponseBody build() {
            return new GetCommonSwitchConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCommonSwitchConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetCommonSwitchConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TargetDefault")
        private String targetDefault;

        @com.aliyun.core.annotation.NameInMap("TargetSyncStatus")
        private String targetSyncStatus;

        private Data(Builder builder) {
            this.targetDefault = builder.targetDefault;
            this.targetSyncStatus = builder.targetSyncStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return targetDefault
         */
        public String getTargetDefault() {
            return this.targetDefault;
        }

        /**
         * @return targetSyncStatus
         */
        public String getTargetSyncStatus() {
            return this.targetSyncStatus;
        }

        public static final class Builder {
            private String targetDefault; 
            private String targetSyncStatus; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.targetDefault = model.targetDefault;
                this.targetSyncStatus = model.targetSyncStatus;
            } 

            /**
             * <p>Specifies whether to turn on the switch for newly added servers. Valid values:</p>
             * <ul>
             * <li><strong>add</strong>: By default, the switch is turned on for newly added servers.</li>
             * <li><strong>del</strong>: By default, the switch is turned off for newly added servers.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>add</p>
             */
            public Builder targetDefault(String targetDefault) {
                this.targetDefault = targetDefault;
                return this;
            }

            /**
             * <p>The status of the synchronization. Valid values:</p>
             * <ul>
             * <li><strong>sync</strong>: The modifications are being synchronized.</li>
             * <li><strong>valid</strong>: The modifications has taken effect.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>valid</p>
             */
            public Builder targetSyncStatus(String targetSyncStatus) {
                this.targetSyncStatus = targetSyncStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
