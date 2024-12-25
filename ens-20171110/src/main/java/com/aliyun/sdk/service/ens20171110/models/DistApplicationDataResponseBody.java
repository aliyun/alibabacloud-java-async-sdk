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
 * {@link DistApplicationDataResponseBody} extends {@link TeaModel}
 *
 * <p>DistApplicationDataResponseBody</p>
 */
public class DistApplicationDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DistInstanceIds")
    private DistInstanceIds distInstanceIds;

    @com.aliyun.core.annotation.NameInMap("DistInstanceTotalCount")
    private Integer distInstanceTotalCount;

    @com.aliyun.core.annotation.NameInMap("DistResults")
    private DistResults distResults;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DistApplicationDataResponseBody(Builder builder) {
        this.distInstanceIds = builder.distInstanceIds;
        this.distInstanceTotalCount = builder.distInstanceTotalCount;
        this.distResults = builder.distResults;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DistApplicationDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return distInstanceIds
     */
    public DistInstanceIds getDistInstanceIds() {
        return this.distInstanceIds;
    }

    /**
     * @return distInstanceTotalCount
     */
    public Integer getDistInstanceTotalCount() {
        return this.distInstanceTotalCount;
    }

    /**
     * @return distResults
     */
    public DistResults getDistResults() {
        return this.distResults;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DistInstanceIds distInstanceIds; 
        private Integer distInstanceTotalCount; 
        private DistResults distResults; 
        private String requestId; 

        /**
         * <p>The list of ENS instance IDs.</p>
         */
        public Builder distInstanceIds(DistInstanceIds distInstanceIds) {
            this.distInstanceIds = distInstanceIds;
            return this;
        }

        /**
         * <p>The total number of ENS instance IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder distInstanceTotalCount(Integer distInstanceTotalCount) {
            this.distInstanceTotalCount = distInstanceTotalCount;
            return this;
        }

        /**
         * <p>The distribution result of the data file.</p>
         */
        public Builder distResults(DistResults distResults) {
            this.distResults = distResults;
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

        public DistApplicationDataResponseBody build() {
            return new DistApplicationDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DistApplicationDataResponseBody} extends {@link TeaModel}
     *
     * <p>DistApplicationDataResponseBody</p>
     */
    public static class DistInstanceIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DistInstanceId")
        private java.util.List<String> distInstanceId;

        private DistInstanceIds(Builder builder) {
            this.distInstanceId = builder.distInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DistInstanceIds create() {
            return builder().build();
        }

        /**
         * @return distInstanceId
         */
        public java.util.List<String> getDistInstanceId() {
            return this.distInstanceId;
        }

        public static final class Builder {
            private java.util.List<String> distInstanceId; 

            /**
             * DistInstanceId.
             */
            public Builder distInstanceId(java.util.List<String> distInstanceId) {
                this.distInstanceId = distInstanceId;
                return this;
            }

            public DistInstanceIds build() {
                return new DistInstanceIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DistApplicationDataResponseBody} extends {@link TeaModel}
     *
     * <p>DistApplicationDataResponseBody</p>
     */
    public static class DistResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ResultCode")
        private Integer resultCode;

        @com.aliyun.core.annotation.NameInMap("ResultDescrip")
        private String resultDescrip;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private DistResult(Builder builder) {
            this.name = builder.name;
            this.resultCode = builder.resultCode;
            this.resultDescrip = builder.resultDescrip;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DistResult create() {
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
             * <p>gcs-prod-websocket-eip-unicom</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The error code. The value is of the enumerated data type.</p>
             * 
             * <strong>example:</strong>
             * <p>400</p>
             */
            public Builder resultCode(Integer resultCode) {
                this.resultCode = resultCode;
                return this;
            }

            /**
             * <p>The description of the distribution result.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
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

            public DistResult build() {
                return new DistResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link DistApplicationDataResponseBody} extends {@link TeaModel}
     *
     * <p>DistApplicationDataResponseBody</p>
     */
    public static class DistResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DistResult")
        private java.util.List<DistResult> distResult;

        private DistResults(Builder builder) {
            this.distResult = builder.distResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DistResults create() {
            return builder().build();
        }

        /**
         * @return distResult
         */
        public java.util.List<DistResult> getDistResult() {
            return this.distResult;
        }

        public static final class Builder {
            private java.util.List<DistResult> distResult; 

            /**
             * DistResult.
             */
            public Builder distResult(java.util.List<DistResult> distResult) {
                this.distResult = distResult;
                return this;
            }

            public DistResults build() {
                return new DistResults(this);
            } 

        } 

    }
}
