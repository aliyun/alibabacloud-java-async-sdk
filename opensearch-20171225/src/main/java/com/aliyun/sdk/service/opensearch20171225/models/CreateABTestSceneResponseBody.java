// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

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
 * {@link CreateABTestSceneResponseBody} extends {@link TeaModel}
 *
 * <p>CreateABTestSceneResponseBody</p>
 */
public class CreateABTestSceneResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private CreateABTestSceneResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateABTestSceneResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(CreateABTestSceneResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D77D0DAF-790D-F5F5-A9C0-133738165014</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public CreateABTestSceneResponseBody build() {
            return new CreateABTestSceneResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateABTestSceneResponseBody} extends {@link TeaModel}
     *
     * <p>CreateABTestSceneResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("created")
        private Integer created;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("updated")
        private Integer updated;

        @com.aliyun.core.annotation.NameInMap("values")
        private java.util.List<String> values;

        private Result(Builder builder) {
            this.created = builder.created;
            this.id = builder.id;
            this.name = builder.name;
            this.status = builder.status;
            this.updated = builder.updated;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return created
         */
        public Integer getCreated() {
            return this.created;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return updated
         */
        public Integer getUpdated() {
            return this.updated;
        }

        /**
         * @return values
         */
        public java.util.List<String> getValues() {
            return this.values;
        }

        public static final class Builder {
            private Integer created; 
            private String id; 
            private String name; 
            private Integer status; 
            private Integer updated; 
            private java.util.List<String> values; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.created = model.created;
                this.id = model.id;
                this.name = model.name;
                this.status = model.status;
                this.updated = model.updated;
                this.values = model.values;
            } 

            /**
             * <p>The time when the test scenario was created.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder created(Integer created) {
                this.created = created;
                return this;
            }

            /**
             * <p>The ID of the test group.</p>
             * 
             * <strong>example:</strong>
             * <p>20405</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the A/B test group.</p>
             * 
             * <strong>example:</strong>
             * <p>kevintest_2020-5-7_15:21:48</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The status. Valid values:</p>
             * <ul>
             * <li>0: not in effect</li>
             * <li>1: in effect</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the test scenario was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1589012351</p>
             */
            public Builder updated(Integer updated) {
                this.updated = updated;
                return this;
            }

            /**
             * <p>The ID of the test scenario</p>
             */
            public Builder values(java.util.List<String> values) {
                this.values = values;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
