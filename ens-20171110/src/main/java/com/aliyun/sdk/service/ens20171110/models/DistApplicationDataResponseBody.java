// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DistApplicationDataResponseBody} extends {@link TeaModel}
 *
 * <p>DistApplicationDataResponseBody</p>
 */
public class DistApplicationDataResponseBody extends TeaModel {
    @NameInMap("DistInstanceIds")
    private DistInstanceIds distInstanceIds;

    @NameInMap("DistInstanceTotalCount")
    private Integer distInstanceTotalCount;

    @NameInMap("DistResults")
    private DistResults distResults;

    @NameInMap("RequestId")
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
         * The list of ENS instance IDs.
         */
        public Builder distInstanceIds(DistInstanceIds distInstanceIds) {
            this.distInstanceIds = distInstanceIds;
            return this;
        }

        /**
         * The total number of ENS instance IDs.
         */
        public Builder distInstanceTotalCount(Integer distInstanceTotalCount) {
            this.distInstanceTotalCount = distInstanceTotalCount;
            return this;
        }

        /**
         * The distribution result of the data file.
         */
        public Builder distResults(DistResults distResults) {
            this.distResults = distResults;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DistApplicationDataResponseBody build() {
            return new DistApplicationDataResponseBody(this);
        } 

    } 

    public static class DistInstanceIds extends TeaModel {
        @NameInMap("DistInstanceId")
        private java.util.List < String > distInstanceId;

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
        public java.util.List < String > getDistInstanceId() {
            return this.distInstanceId;
        }

        public static final class Builder {
            private java.util.List < String > distInstanceId; 

            /**
             * DistInstanceId.
             */
            public Builder distInstanceId(java.util.List < String > distInstanceId) {
                this.distInstanceId = distInstanceId;
                return this;
            }

            public DistInstanceIds build() {
                return new DistInstanceIds(this);
            } 

        } 

    }
    public static class DistResult extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("ResultCode")
        private Integer resultCode;

        @NameInMap("ResultDescrip")
        private String resultDescrip;

        @NameInMap("Version")
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
             * The name of the data file.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The error code. The value is of the enumerated data type.
             */
            public Builder resultCode(Integer resultCode) {
                this.resultCode = resultCode;
                return this;
            }

            /**
             * The description of the distribution result.
             */
            public Builder resultDescrip(String resultDescrip) {
                this.resultDescrip = resultDescrip;
                return this;
            }

            /**
             * The version number of the data file.
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
    public static class DistResults extends TeaModel {
        @NameInMap("DistResult")
        private java.util.List < DistResult> distResult;

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
        public java.util.List < DistResult> getDistResult() {
            return this.distResult;
        }

        public static final class Builder {
            private java.util.List < DistResult> distResult; 

            /**
             * DistResult.
             */
            public Builder distResult(java.util.List < DistResult> distResult) {
                this.distResult = distResult;
                return this;
            }

            public DistResults build() {
                return new DistResults(this);
            } 

        } 

    }
}
