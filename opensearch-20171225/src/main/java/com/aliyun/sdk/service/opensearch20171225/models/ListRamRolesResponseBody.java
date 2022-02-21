// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRamRolesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRamRolesResponseBody</p>
 */
public class ListRamRolesResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private java.util.List < Result> result;

    private ListRamRolesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRamRolesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListRamRolesResponseBody build() {
            return new ListRamRolesResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("assumed")
        private Boolean assumed;

        @NameInMap("name")
        private String name;

        @NameInMap("service")
        private String service;

        @NameInMap("template_id")
        private String templateId;

        private Result(Builder builder) {
            this.assumed = builder.assumed;
            this.name = builder.name;
            this.service = builder.service;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return assumed
         */
        public Boolean getAssumed() {
            return this.assumed;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return service
         */
        public String getService() {
            return this.service;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private Boolean assumed; 
            private String name; 
            private String service; 
            private String templateId; 

            /**
             * assumed.
             */
            public Builder assumed(Boolean assumed) {
                this.assumed = assumed;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * service.
             */
            public Builder service(String service) {
                this.service = service;
                return this;
            }

            /**
             * template_id.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
