// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link ListAllReleaseWorkflowsResponse} extends {@link TeaModel}
 *
 * <p>ListAllReleaseWorkflowsResponse</p>
 */
public class ListAllReleaseWorkflowsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.List<ListAllReleaseWorkflowsResponseBody> body;

    private ListAllReleaseWorkflowsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListAllReleaseWorkflowsResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public java.util.List<ListAllReleaseWorkflowsResponseBody> getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAllReleaseWorkflowsResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(java.util.List<ListAllReleaseWorkflowsResponseBody> body);

        @Override
        ListAllReleaseWorkflowsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAllReleaseWorkflowsResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private java.util.List<ListAllReleaseWorkflowsResponseBody> body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAllReleaseWorkflowsResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(java.util.List<ListAllReleaseWorkflowsResponseBody> body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAllReleaseWorkflowsResponse build() {
            return new ListAllReleaseWorkflowsResponse(this);
        } 

    } 

    /**
     * 
     * {@link ListAllReleaseWorkflowsResponse} extends {@link TeaModel}
     *
     * <p>ListAllReleaseWorkflowsResponse</p>
     */
    public static class VariableGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("displayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private VariableGroups(Builder builder) {
            this.name = builder.name;
            this.displayName = builder.displayName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VariableGroups create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String name; 
            private String displayName; 
            private String type; 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * displayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public VariableGroups build() {
                return new VariableGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAllReleaseWorkflowsResponse} extends {@link TeaModel}
     *
     * <p>ListAllReleaseWorkflowsResponse</p>
     */
    public static class ReleaseStages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("sn")
        private String sn;

        @com.aliyun.core.annotation.NameInMap("releaseWorkflowSn")
        private String releaseWorkflowSn;

        @com.aliyun.core.annotation.NameInMap("order")
        private String order;

        @com.aliyun.core.annotation.NameInMap("variableGroups")
        private java.util.List<VariableGroups> variableGroups;

        private ReleaseStages(Builder builder) {
            this.appName = builder.appName;
            this.name = builder.name;
            this.sn = builder.sn;
            this.releaseWorkflowSn = builder.releaseWorkflowSn;
            this.order = builder.order;
            this.variableGroups = builder.variableGroups;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReleaseStages create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sn
         */
        public String getSn() {
            return this.sn;
        }

        /**
         * @return releaseWorkflowSn
         */
        public String getReleaseWorkflowSn() {
            return this.releaseWorkflowSn;
        }

        /**
         * @return order
         */
        public String getOrder() {
            return this.order;
        }

        /**
         * @return variableGroups
         */
        public java.util.List<VariableGroups> getVariableGroups() {
            return this.variableGroups;
        }

        public static final class Builder {
            private String appName; 
            private String name; 
            private String sn; 
            private String releaseWorkflowSn; 
            private String order; 
            private java.util.List<VariableGroups> variableGroups; 

            /**
             * appName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
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
             * sn.
             */
            public Builder sn(String sn) {
                this.sn = sn;
                return this;
            }

            /**
             * releaseWorkflowSn.
             */
            public Builder releaseWorkflowSn(String releaseWorkflowSn) {
                this.releaseWorkflowSn = releaseWorkflowSn;
                return this;
            }

            /**
             * order.
             */
            public Builder order(String order) {
                this.order = order;
                return this;
            }

            /**
             * variableGroups.
             */
            public Builder variableGroups(java.util.List<VariableGroups> variableGroups) {
                this.variableGroups = variableGroups;
                return this;
            }

            public ReleaseStages build() {
                return new ReleaseStages(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAllReleaseWorkflowsResponse} extends {@link TeaModel}
     *
     * <p>ListAllReleaseWorkflowsResponse</p>
     */
    public static class ListAllReleaseWorkflowsResponseBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("sn")
        private String sn;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("order")
        private String order;

        @com.aliyun.core.annotation.NameInMap("releaseStages")
        private java.util.List<ReleaseStages> releaseStages;

        @com.aliyun.core.annotation.NameInMap("note")
        private String note;

        private ListAllReleaseWorkflowsResponseBody(Builder builder) {
            this.appName = builder.appName;
            this.sn = builder.sn;
            this.name = builder.name;
            this.order = builder.order;
            this.releaseStages = builder.releaseStages;
            this.note = builder.note;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListAllReleaseWorkflowsResponseBody create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return sn
         */
        public String getSn() {
            return this.sn;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return order
         */
        public String getOrder() {
            return this.order;
        }

        /**
         * @return releaseStages
         */
        public java.util.List<ReleaseStages> getReleaseStages() {
            return this.releaseStages;
        }

        /**
         * @return note
         */
        public String getNote() {
            return this.note;
        }

        public static final class Builder {
            private String appName; 
            private String sn; 
            private String name; 
            private String order; 
            private java.util.List<ReleaseStages> releaseStages; 
            private String note; 

            /**
             * appName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * sn.
             */
            public Builder sn(String sn) {
                this.sn = sn;
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
             * order.
             */
            public Builder order(String order) {
                this.order = order;
                return this;
            }

            /**
             * releaseStages.
             */
            public Builder releaseStages(java.util.List<ReleaseStages> releaseStages) {
                this.releaseStages = releaseStages;
                return this;
            }

            /**
             * note.
             */
            public Builder note(String note) {
                this.note = note;
                return this;
            }

            public ListAllReleaseWorkflowsResponseBody build() {
                return new ListAllReleaseWorkflowsResponseBody(this);
            } 

        } 

    }
}
