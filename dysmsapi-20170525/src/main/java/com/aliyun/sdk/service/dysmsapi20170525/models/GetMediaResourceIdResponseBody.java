// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMediaResourceIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetMediaResourceIdResponseBody</p>
 */
public class GetMediaResourceIdResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetMediaResourceIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMediaResourceIdResponseBody create() {
        return builder().build();
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
        private Data data; 
        private String requestId; 
        private Boolean success; 

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
        public Builder data(Data data) {
            this.data = data;
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

        public GetMediaResourceIdResponseBody build() {
            return new GetMediaResourceIdResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ResUrlDownload")
        private String resUrlDownload;

        @NameInMap("ResourceId")
        private Long resourceId;

        private Data(Builder builder) {
            this.resUrlDownload = builder.resUrlDownload;
            this.resourceId = builder.resourceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return resUrlDownload
         */
        public String getResUrlDownload() {
            return this.resUrlDownload;
        }

        /**
         * @return resourceId
         */
        public Long getResourceId() {
            return this.resourceId;
        }

        public static final class Builder {
            private String resUrlDownload; 
            private Long resourceId; 

            /**
             * ResUrlDownload.
             */
            public Builder resUrlDownload(String resUrlDownload) {
                this.resUrlDownload = resUrlDownload;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(Long resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
