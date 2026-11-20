// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

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
 * {@link GetLastUpgradeRecordResponseBody} extends {@link TeaModel}
 *
 * <p>GetLastUpgradeRecordResponseBody</p>
 */
public class GetLastUpgradeRecordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetLastUpgradeRecordResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLastUpgradeRecordResponseBody create() {
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

        private Builder(GetLastUpgradeRecordResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>819A7F0F-2951-540F-BD94-6A41ECF0281F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetLastUpgradeRecordResponseBody build() {
            return new GetLastUpgradeRecordResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLastUpgradeRecordResponseBody} extends {@link TeaModel}
     *
     * <p>GetLastUpgradeRecordResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fromVersion")
        private String fromVersion;

        @com.aliyun.core.annotation.NameInMap("startReadonlyTime")
        private String startReadonlyTime;

        @com.aliyun.core.annotation.NameInMap("stopReadonlyTime")
        private String stopReadonlyTime;

        @com.aliyun.core.annotation.NameInMap("toVersion")
        private String toVersion;

        private Data(Builder builder) {
            this.fromVersion = builder.fromVersion;
            this.startReadonlyTime = builder.startReadonlyTime;
            this.stopReadonlyTime = builder.stopReadonlyTime;
            this.toVersion = builder.toVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return fromVersion
         */
        public String getFromVersion() {
            return this.fromVersion;
        }

        /**
         * @return startReadonlyTime
         */
        public String getStartReadonlyTime() {
            return this.startReadonlyTime;
        }

        /**
         * @return stopReadonlyTime
         */
        public String getStopReadonlyTime() {
            return this.stopReadonlyTime;
        }

        /**
         * @return toVersion
         */
        public String getToVersion() {
            return this.toVersion;
        }

        public static final class Builder {
            private String fromVersion; 
            private String startReadonlyTime; 
            private String stopReadonlyTime; 
            private String toVersion; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.fromVersion = model.fromVersion;
                this.startReadonlyTime = model.startReadonlyTime;
                this.stopReadonlyTime = model.stopReadonlyTime;
                this.toVersion = model.toVersion;
            } 

            /**
             * <p>The initial version.</p>
             * 
             * <strong>example:</strong>
             * <p>r3.2.11</p>
             */
            public Builder fromVersion(String fromVersion) {
                this.fromVersion = fromVersion;
                return this;
            }

            /**
             * <p>The start time of the read-only state. The format is YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-09-24 17:29:57</p>
             */
            public Builder startReadonlyTime(String startReadonlyTime) {
                this.startReadonlyTime = startReadonlyTime;
                return this;
            }

            /**
             * <p>The end time of the read-only state. The format is YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-09-24 18:23:22</p>
             */
            public Builder stopReadonlyTime(String stopReadonlyTime) {
                this.stopReadonlyTime = stopReadonlyTime;
                return this;
            }

            /**
             * <p>The target version.</p>
             * 
             * <strong>example:</strong>
             * <p>r4.0.2</p>
             */
            public Builder toVersion(String toVersion) {
                this.toVersion = toVersion;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
