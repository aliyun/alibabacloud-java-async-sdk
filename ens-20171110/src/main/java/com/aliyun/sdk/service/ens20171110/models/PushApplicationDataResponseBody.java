// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link PushApplicationDataResponseBody} extends {@link TeaModel}
 *
 * <p>PushApplicationDataResponseBody</p>
 */
public class PushApplicationDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PushResults")
    private PushResults pushResults;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private PushApplicationDataResponseBody(Builder builder) {
        this.pushResults = builder.pushResults;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushApplicationDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return pushResults
     */
    public PushResults getPushResults() {
        return this.pushResults;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PushResults pushResults; 
        private String requestId; 

        /**
         * <p>The push results of data files.</p>
         */
        public Builder pushResults(PushResults pushResults) {
            this.pushResults = pushResults;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PushApplicationDataResponseBody build() {
            return new PushApplicationDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PushApplicationDataResponseBody} extends {@link TeaModel}
     *
     * <p>PushApplicationDataResponseBody</p>
     */
    public static class PushResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ResultCode")
        private Integer resultCode;

        @com.aliyun.core.annotation.NameInMap("ResultDescrip")
        private String resultDescrip;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private PushResult(Builder builder) {
            this.name = builder.name;
            this.resultCode = builder.resultCode;
            this.resultDescrip = builder.resultDescrip;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PushResult create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return resultCode
         */
        public Integer getResultCode() {
            return this.resultCode;
        }

        /**
         * @return resultDescrip
         */
        public String getResultDescrip() {
            return this.resultDescrip;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String name; 
            private Integer resultCode; 
            private String resultDescrip; 
            private String version; 

            /**
             * <p>The name of the data file.</p>
             * 
             * <strong>example:</strong>
             * <p>gcs-pre-websocket-eip-telecom</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The push result. The value is of the enumeration type. Valid values:</p>
             * <ul>
             * <li>0: The push operation is successful.</li>
             * <li>100: The push operation has been performed and the file is pushed.</li>
             * <li>200: The push operation has been performed and the file is being pushed to specific file servers.</li>
             * <li>300: The push operation failed. You must trigger the push operation again. The ResultDescrip parameter indicates the error description.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder resultCode(Integer resultCode) {
                this.resultCode = resultCode;
                return this;
            }

            /**
             * <p>The description of the push status.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder resultDescrip(String resultDescrip) {
                this.resultDescrip = resultDescrip;
                return this;
            }

            /**
             * <p>The version number of the data file.</p>
             * 
             * <strong>example:</strong>
             * <p>standard</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public PushResult build() {
                return new PushResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link PushApplicationDataResponseBody} extends {@link TeaModel}
     *
     * <p>PushApplicationDataResponseBody</p>
     */
    public static class PushResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PushResult")
        private java.util.List<PushResult> pushResult;

        private PushResults(Builder builder) {
            this.pushResult = builder.pushResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PushResults create() {
            return builder().build();
        }

        /**
         * @return pushResult
         */
        public java.util.List<PushResult> getPushResult() {
            return this.pushResult;
        }

        public static final class Builder {
            private java.util.List<PushResult> pushResult; 

            /**
             * PushResult.
             */
            public Builder pushResult(java.util.List<PushResult> pushResult) {
                this.pushResult = pushResult;
                return this;
            }

            public PushResults build() {
                return new PushResults(this);
            } 

        } 

    }
}
