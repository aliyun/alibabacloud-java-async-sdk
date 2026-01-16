// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link GetDedicatedIpWarmUpInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetDedicatedIpWarmUpInfoResponseBody</p>
 */
public class GetDedicatedIpWarmUpInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Info")
    private java.util.List<Info> info;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDedicatedIpWarmUpInfoResponseBody(Builder builder) {
        this.info = builder.info;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDedicatedIpWarmUpInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return info
     */
    public java.util.List<Info> getInfo() {
        return this.info;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Info> info; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetDedicatedIpWarmUpInfoResponseBody model) {
            this.info = model.info;
            this.requestId = model.requestId;
        } 

        /**
         * Info.
         */
        public Builder info(java.util.List<Info> info) {
            this.info = info;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDedicatedIpWarmUpInfoResponseBody build() {
            return new GetDedicatedIpWarmUpInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDedicatedIpWarmUpInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetDedicatedIpWarmUpInfoResponseBody</p>
     */
    public static class Info extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Esp")
        private String esp;

        @com.aliyun.core.annotation.NameInMap("Finished")
        private Boolean finished;

        private Info(Builder builder) {
            this.esp = builder.esp;
            this.finished = builder.finished;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Info create() {
            return builder().build();
        }

        /**
         * @return esp
         */
        public String getEsp() {
            return this.esp;
        }

        /**
         * @return finished
         */
        public Boolean getFinished() {
            return this.finished;
        }

        public static final class Builder {
            private String esp; 
            private Boolean finished; 

            private Builder() {
            } 

            private Builder(Info model) {
                this.esp = model.esp;
                this.finished = model.finished;
            } 

            /**
             * Esp.
             */
            public Builder esp(String esp) {
                this.esp = esp;
                return this;
            }

            /**
             * Finished.
             */
            public Builder finished(Boolean finished) {
                this.finished = finished;
                return this;
            }

            public Info build() {
                return new Info(this);
            } 

        } 

    }
}
