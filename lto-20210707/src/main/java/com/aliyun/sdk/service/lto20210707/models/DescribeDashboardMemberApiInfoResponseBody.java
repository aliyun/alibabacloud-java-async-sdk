// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lto20210707.models;

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
 * {@link DescribeDashboardMemberApiInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDashboardMemberApiInfoResponseBody</p>
 */
public class DescribeDashboardMemberApiInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeDashboardMemberApiInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDashboardMemberApiInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private String code; 
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeDashboardMemberApiInfoResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeDashboardMemberApiInfoResponseBody build() {
            return new DescribeDashboardMemberApiInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDashboardMemberApiInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDashboardMemberApiInfoResponseBody</p>
     */
    public static class MemberInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiInvokeCount")
        private Long apiInvokeCount;

        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        private MemberInfoList(Builder builder) {
            this.apiInvokeCount = builder.apiInvokeCount;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MemberInfoList create() {
            return builder().build();
        }

        /**
         * @return apiInvokeCount
         */
        public Long getApiInvokeCount() {
            return this.apiInvokeCount;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        public static final class Builder {
            private Long apiInvokeCount; 
            private Long time; 

            private Builder() {
            } 

            private Builder(MemberInfoList model) {
                this.apiInvokeCount = model.apiInvokeCount;
                this.time = model.time;
            } 

            /**
             * ApiInvokeCount.
             */
            public Builder apiInvokeCount(Long apiInvokeCount) {
                this.apiInvokeCount = apiInvokeCount;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            public MemberInfoList build() {
                return new MemberInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDashboardMemberApiInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDashboardMemberApiInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MemberInfoList")
        private java.util.List<MemberInfoList> memberInfoList;

        @com.aliyun.core.annotation.NameInMap("MemberName")
        private String memberName;

        private Data(Builder builder) {
            this.memberInfoList = builder.memberInfoList;
            this.memberName = builder.memberName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return memberInfoList
         */
        public java.util.List<MemberInfoList> getMemberInfoList() {
            return this.memberInfoList;
        }

        /**
         * @return memberName
         */
        public String getMemberName() {
            return this.memberName;
        }

        public static final class Builder {
            private java.util.List<MemberInfoList> memberInfoList; 
            private String memberName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.memberInfoList = model.memberInfoList;
                this.memberName = model.memberName;
            } 

            /**
             * MemberInfoList.
             */
            public Builder memberInfoList(java.util.List<MemberInfoList> memberInfoList) {
                this.memberInfoList = memberInfoList;
                return this;
            }

            /**
             * MemberName.
             */
            public Builder memberName(String memberName) {
                this.memberName = memberName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
