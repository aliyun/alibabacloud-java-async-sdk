// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

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
 * {@link ReleaseExpiredPrepaidInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ReleaseExpiredPrepaidInstanceResponseBody</p>
 */
public class ReleaseExpiredPrepaidInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Class")
    private String _class;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ReleaseExpiredPrepaidInstanceResponseBody(Builder builder) {
        this._class = builder._class;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseExpiredPrepaidInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return _class
     */
    public String get_class() {
        return this._class;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String _class; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ReleaseExpiredPrepaidInstanceResponseBody model) {
            this._class = model._class;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p><strong>[Deprecated]</strong> The field is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>deprecated</p>
         */
        public Builder _class(String _class) {
            this._class = _class;
            return this;
        }

        /**
         * <p>The error code returned when the call fails. For more information, see Error codes.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DF58589C-A06C-4224-8615-7797E6474FA3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ReleaseExpiredPrepaidInstanceResponseBody build() {
            return new ReleaseExpiredPrepaidInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ReleaseExpiredPrepaidInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>ReleaseExpiredPrepaidInstanceResponseBody</p>
     */
    public static class InstanceResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private InstanceResults(Builder builder) {
            this.instanceId = builder.instanceId;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceResults create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String instanceId; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(InstanceResults model) {
                this.instanceId = model.instanceId;
                this.success = model.success;
            } 

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-1</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Indicates whether the operation is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public InstanceResults build() {
                return new InstanceResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link ReleaseExpiredPrepaidInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>ReleaseExpiredPrepaidInstanceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HostId")
        private String hostId;

        @com.aliyun.core.annotation.NameInMap("InstanceResults")
        private java.util.List<InstanceResults> instanceResults;

        @com.aliyun.core.annotation.NameInMap("ReleaseResult")
        private Boolean releaseResult;

        private Data(Builder builder) {
            this.hostId = builder.hostId;
            this.instanceResults = builder.instanceResults;
            this.releaseResult = builder.releaseResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return hostId
         */
        public String getHostId() {
            return this.hostId;
        }

        /**
         * @return instanceResults
         */
        public java.util.List<InstanceResults> getInstanceResults() {
            return this.instanceResults;
        }

        /**
         * @return releaseResult
         */
        public Boolean getReleaseResult() {
            return this.releaseResult;
        }

        public static final class Builder {
            private String hostId; 
            private java.util.List<InstanceResults> instanceResults; 
            private Boolean releaseResult; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.hostId = model.hostId;
                this.instanceResults = model.instanceResults;
                this.releaseResult = model.releaseResult;
            } 

            /**
             * <p><strong>[Deprecated]</strong> The field is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>deprecated</p>
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            /**
             * <p>The list of instance results.</p>
             */
            public Builder instanceResults(java.util.List<InstanceResults> instanceResults) {
                this.instanceResults = instanceResults;
                return this;
            }

            /**
             * <p>Indicates whether the release operation is successful.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder releaseResult(Boolean releaseResult) {
                this.releaseResult = releaseResult;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
