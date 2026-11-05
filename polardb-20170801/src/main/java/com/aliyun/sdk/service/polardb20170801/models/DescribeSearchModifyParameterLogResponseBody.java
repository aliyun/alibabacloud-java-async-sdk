// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeSearchModifyParameterLogResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSearchModifyParameterLogResponseBody</p>
 */
public class DescribeSearchModifyParameterLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    private String engineVersion;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeSearchModifyParameterLogResponseBody(Builder builder) {
        this.engine = builder.engine;
        this.engineVersion = builder.engineVersion;
        this.items = builder.items;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSearchModifyParameterLogResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return engineVersion
     */
    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String engine; 
        private String engineVersion; 
        private java.util.List<Items> items; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeSearchModifyParameterLogResponseBody model) {
            this.engine = model.engine;
            this.engineVersion = model.engineVersion;
            this.items = model.items;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The type of the Search engine.</p>
         * 
         * <strong>example:</strong>
         * <p>polardb_search</p>
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * <p>The database engine version of the Search DPI engine. This is not the MySQL version of the primary cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>3.0</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * <p>The parameter modification history. The records are returned in descending order of record IDs.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>e3a24663-eee5-4009-b635-2e9e8d052e74</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSearchModifyParameterLogResponseBody build() {
            return new DescribeSearchModifyParameterLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSearchModifyParameterLogResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSearchModifyParameterLogResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("NewParameterValue")
        private String newParameterValue;

        @com.aliyun.core.annotation.NameInMap("OldParameterValue")
        private String oldParameterValue;

        @com.aliyun.core.annotation.NameInMap("ParameterName")
        private String parameterName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Items(Builder builder) {
            this.modifyTime = builder.modifyTime;
            this.newParameterValue = builder.newParameterValue;
            this.oldParameterValue = builder.oldParameterValue;
            this.parameterName = builder.parameterName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return newParameterValue
         */
        public String getNewParameterValue() {
            return this.newParameterValue;
        }

        /**
         * @return oldParameterValue
         */
        public String getOldParameterValue() {
            return this.oldParameterValue;
        }

        /**
         * @return parameterName
         */
        public String getParameterName() {
            return this.parameterName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String modifyTime; 
            private String newParameterValue; 
            private String oldParameterValue; 
            private String parameterName; 
            private String status; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.modifyTime = model.modifyTime;
                this.newParameterValue = model.newParameterValue;
                this.oldParameterValue = model.oldParameterValue;
                this.parameterName = model.parameterName;
                this.status = model.status;
            } 

            /**
             * <p>The time when the parameter was modified. The time is displayed in the yyyy-MM-ddTHH:mm:ssZ format in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-14T07:04:29Z</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The new value of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder newParameterValue(String newParameterValue) {
                this.newParameterValue = newParameterValue;
                return this;
            }

            /**
             * <p>The original value of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder oldParameterValue(String oldParameterValue) {
                this.oldParameterValue = oldParameterValue;
                return this;
            }

            /**
             * <p>The name of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>http.compression_level</p>
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * <p>The modification status. Valid values:</p>
             * <ul>
             * <li>Syncing: The modification has not taken effect.</li>
             * <li>Applied: The modification has taken effect.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Applied</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
