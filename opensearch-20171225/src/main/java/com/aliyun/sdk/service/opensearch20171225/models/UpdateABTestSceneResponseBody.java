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
 * {@link UpdateABTestSceneResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateABTestSceneResponseBody</p>
 */
public class UpdateABTestSceneResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private UpdateABTestSceneResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateABTestSceneResponseBody create() {
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

        private Builder(UpdateABTestSceneResponseBody model) {
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
         * <p>The details of the test scenario. For more information, see <a href="https://help.aliyun.com/document_detail/173618.html">ABTestScene</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public UpdateABTestSceneResponseBody build() {
            return new UpdateABTestSceneResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateABTestSceneResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateABTestSceneResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("created")
        private Integer created;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("online")
        private Boolean online;

        @com.aliyun.core.annotation.NameInMap("params")
        private java.util.Map<String, ?> params;

        @com.aliyun.core.annotation.NameInMap("traffic")
        private Integer traffic;

        @com.aliyun.core.annotation.NameInMap("updated")
        private Integer updated;

        private Result(Builder builder) {
            this.created = builder.created;
            this.id = builder.id;
            this.name = builder.name;
            this.online = builder.online;
            this.params = builder.params;
            this.traffic = builder.traffic;
            this.updated = builder.updated;
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
         * @return online
         */
        public Boolean getOnline() {
            return this.online;
        }

        /**
         * @return params
         */
        public java.util.Map<String, ?> getParams() {
            return this.params;
        }

        /**
         * @return traffic
         */
        public Integer getTraffic() {
            return this.traffic;
        }

        /**
         * @return updated
         */
        public Integer getUpdated() {
            return this.updated;
        }

        public static final class Builder {
            private Integer created; 
            private String id; 
            private String name; 
            private Boolean online; 
            private java.util.Map<String, ?> params; 
            private Integer traffic; 
            private Integer updated; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.created = model.created;
                this.id = model.id;
                this.name = model.name;
                this.online = model.online;
                this.params = model.params;
                this.traffic = model.traffic;
                this.updated = model.updated;
            } 

            /**
             * <p>The time when the test scenario was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1596527691</p>
             */
            public Builder created(Integer created) {
                this.created = created;
                return this;
            }

            /**
             * <p>The ID of the test scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>20614</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the test scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>kevintest22</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The status of the test. Valid values:</p>
             * <ul>
             * <li>true: The test is started.</li>
             * <li>false: The test is stopped.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder online(Boolean online) {
                this.online = online;
                return this;
            }

            /**
             * <p>The parameters of the A/B test.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder params(java.util.Map<String, ?> params) {
                this.params = params;
                return this;
            }

            /**
             * <p>The percentage of traffic that is allocated to the A/B test. Valid values: 0 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder traffic(Integer traffic) {
                this.traffic = traffic;
                return this;
            }

            /**
             * <p>The time when the test scenario was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1596527691</p>
             */
            public Builder updated(Integer updated) {
                this.updated = updated;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
