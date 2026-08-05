// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240401.models;

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
 * {@link ListConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>ListConfigsResponseBody</p>
 */
public class ListConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("page")
    private Integer page;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private ListConfigsResponseBody(Builder builder) {
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConfigsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
    public java.util.List<Result> getResult() {
        return this.result;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer page; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<Result> result; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListConfigsResponseBody model) {
            this.page = model.page;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.result = model.result;
            this.total = model.total;
        } 

        /**
         * page.
         */
        public Builder page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

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
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListConfigsResponseBody build() {
            return new ListConfigsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>ListConfigsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("configData")
        private java.util.Map<String, ?> configData;

        @com.aliyun.core.annotation.NameInMap("configType")
        private String configType;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Result(Builder builder) {
            this.configData = builder.configData;
            this.configType = builder.configType;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return configData
         */
        public java.util.Map<String, ?> getConfigData() {
            return this.configData;
        }

        /**
         * @return configType
         */
        public String getConfigType() {
            return this.configType;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private java.util.Map<String, ?> configData; 
            private String configType; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.configData = model.configData;
                this.configType = model.configType;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * configData.
             */
            public Builder configData(java.util.Map<String, ?> configData) {
                this.configData = configData;
                return this;
            }

            /**
             * configType.
             */
            public Builder configType(String configType) {
                this.configType = configType;
                return this;
            }

            /**
             * workspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
