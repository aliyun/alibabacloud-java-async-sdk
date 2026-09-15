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
 * {@link GetTenantCheckAvailableResponseBody} extends {@link TeaModel}
 *
 * <p>GetTenantCheckAvailableResponseBody</p>
 */
public class GetTenantCheckAvailableResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetTenantCheckAvailableResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTenantCheckAvailableResponseBody create() {
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

        private Builder(GetTenantCheckAvailableResponseBody model) {
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
         * <p>The ID of the request. Alibaba Cloud generates a unique identifier for each request. You can use the ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>69BFFCDE-37D6-5A49-A8BC-BB03AC83****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetTenantCheckAvailableResponseBody build() {
            return new GetTenantCheckAvailableResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTenantCheckAvailableResponseBody} extends {@link TeaModel}
     *
     * <p>GetTenantCheckAvailableResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NextScanTime")
        private Long nextScanTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private Data(Builder builder) {
            this.nextScanTime = builder.nextScanTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return nextScanTime
         */
        public Long getNextScanTime() {
            return this.nextScanTime;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long nextScanTime; 
            private Integer status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.nextScanTime = model.nextScanTime;
                this.status = model.status;
            } 

            /**
             * <p>The timestamp of the next time when a one-click scan can be submitted.</p>
             * 
             * <strong>example:</strong>
             * <p>1725530005357</p>
             */
            public Builder nextScanTime(Long nextScanTime) {
                this.nextScanTime = nextScanTime;
                return this;
            }

            /**
             * <p>The current status of the one-click scan. Valid values:</p>
             * <ul>
             * <li><p>0: The one-click scan can be submitted.</p>
             * </li>
             * <li><p>1: The current task is not complete. The scan cannot be submitted.</p>
             * </li>
             * <li><p>2: The free scan quota for this week has been used. Wait until the next free scan time.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
