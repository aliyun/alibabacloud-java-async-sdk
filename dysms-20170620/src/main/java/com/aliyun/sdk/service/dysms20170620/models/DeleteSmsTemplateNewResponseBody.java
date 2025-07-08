// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link DeleteSmsTemplateNewResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteSmsTemplateNewResponseBody</p>
 */
public class DeleteSmsTemplateNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailList")
    private FailList failList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SuccessList")
    private SuccessList successList;

    private DeleteSmsTemplateNewResponseBody(Builder builder) {
        this.failList = builder.failList;
        this.requestId = builder.requestId;
        this.successList = builder.successList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSmsTemplateNewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return failList
     */
    public FailList getFailList() {
        return this.failList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return successList
     */
    public SuccessList getSuccessList() {
        return this.successList;
    }

    public static final class Builder {
        private FailList failList; 
        private String requestId; 
        private SuccessList successList; 

        private Builder() {
        } 

        private Builder(DeleteSmsTemplateNewResponseBody model) {
            this.failList = model.failList;
            this.requestId = model.requestId;
            this.successList = model.successList;
        } 

        /**
         * FailList.
         */
        public Builder failList(FailList failList) {
            this.failList = failList;
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
         * SuccessList.
         */
        public Builder successList(SuccessList successList) {
            this.successList = successList;
            return this;
        }

        public DeleteSmsTemplateNewResponseBody build() {
            return new DeleteSmsTemplateNewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteSmsTemplateNewResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteSmsTemplateNewResponseBody</p>
     */
    public static class FailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Fail")
        private java.util.List<String> fail;

        private FailList(Builder builder) {
            this.fail = builder.fail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailList create() {
            return builder().build();
        }

        /**
         * @return fail
         */
        public java.util.List<String> getFail() {
            return this.fail;
        }

        public static final class Builder {
            private java.util.List<String> fail; 

            private Builder() {
            } 

            private Builder(FailList model) {
                this.fail = model.fail;
            } 

            /**
             * Fail.
             */
            public Builder fail(java.util.List<String> fail) {
                this.fail = fail;
                return this;
            }

            public FailList build() {
                return new FailList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DeleteSmsTemplateNewResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteSmsTemplateNewResponseBody</p>
     */
    public static class SuccessList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Succes")
        private java.util.List<String> succes;

        private SuccessList(Builder builder) {
            this.succes = builder.succes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuccessList create() {
            return builder().build();
        }

        /**
         * @return succes
         */
        public java.util.List<String> getSucces() {
            return this.succes;
        }

        public static final class Builder {
            private java.util.List<String> succes; 

            private Builder() {
            } 

            private Builder(SuccessList model) {
                this.succes = model.succes;
            } 

            /**
             * Succes.
             */
            public Builder succes(java.util.List<String> succes) {
                this.succes = succes;
                return this;
            }

            public SuccessList build() {
                return new SuccessList(this);
            } 

        } 

    }
}
