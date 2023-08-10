// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAppResponseBody</p>
 */
public class DescribeAppResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private Result result;

    private DescribeAppResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppResponseBody create() {
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
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the version.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DescribeAppResponseBody build() {
            return new DescribeAppResponseBody(this);
        } 

    } 

    public static class Functions extends TeaModel {
        @NameInMap("algo")
        private java.util.List < String > algo;

        @NameInMap("qp")
        private java.util.List < String > qp;

        @NameInMap("service")
        private java.util.List < String > service;

        private Functions(Builder builder) {
            this.algo = builder.algo;
            this.qp = builder.qp;
            this.service = builder.service;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Functions create() {
            return builder().build();
        }

        /**
         * @return algo
         */
        public java.util.List < String > getAlgo() {
            return this.algo;
        }

        /**
         * @return qp
         */
        public java.util.List < String > getQp() {
            return this.qp;
        }

        /**
         * @return service
         */
        public java.util.List < String > getService() {
            return this.service;
        }

        public static final class Builder {
            private java.util.List < String > algo; 
            private java.util.List < String > qp; 
            private java.util.List < String > service; 

            /**
             * algo.
             */
            public Builder algo(java.util.List < String > algo) {
                this.algo = algo;
                return this;
            }

            /**
             * qp.
             */
            public Builder qp(java.util.List < String > qp) {
                this.qp = qp;
                return this;
            }

            /**
             * service.
             */
            public Builder service(java.util.List < String > service) {
                this.service = service;
                return this;
            }

            public Functions build() {
                return new Functions(this);
            } 

        } 

    }
    public static class Domain extends TeaModel {
        @NameInMap("category")
        private String category;

        @NameInMap("functions")
        private Functions functions;

        @NameInMap("name")
        private String name;

        private Domain(Builder builder) {
            this.category = builder.category;
            this.functions = builder.functions;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Domain create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return functions
         */
        public Functions getFunctions() {
            return this.functions;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String category; 
            private Functions functions; 
            private String name; 

            /**
             * category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * functions.
             */
            public Builder functions(Functions functions) {
                this.functions = functions;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Domain build() {
                return new Domain(this);
            } 

        } 

    }
    public static class Quota extends TeaModel {
        @NameInMap("computeResource")
        private Integer computeResource;

        @NameInMap("docSize")
        private Integer docSize;

        @NameInMap("qps")
        private Integer qps;

        @NameInMap("spec")
        private String spec;

        private Quota(Builder builder) {
            this.computeResource = builder.computeResource;
            this.docSize = builder.docSize;
            this.qps = builder.qps;
            this.spec = builder.spec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Quota create() {
            return builder().build();
        }

        /**
         * @return computeResource
         */
        public Integer getComputeResource() {
            return this.computeResource;
        }

        /**
         * @return docSize
         */
        public Integer getDocSize() {
            return this.docSize;
        }

        /**
         * @return qps
         */
        public Integer getQps() {
            return this.qps;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        public static final class Builder {
            private Integer computeResource; 
            private Integer docSize; 
            private Integer qps; 
            private String spec; 

            /**
             * The computing resources. Unit: logical computing units (LCUs).
             */
            public Builder computeResource(Integer computeResource) {
                this.computeResource = computeResource;
                return this;
            }

            /**
             * The storage capacity. Unit: GB.
             */
            public Builder docSize(Integer docSize) {
                this.docSize = docSize;
                return this;
            }

            /**
             * The number of search requests per second. You are charged based on the number of search requests per second in the earlier billing model.
             */
            public Builder qps(Integer qps) {
                this.qps = qps;
                return this;
            }

            /**
             * The specifications of the application. Valid values:
             * <p>
             * 
             * *   opensearch.share.junior: basic
             * *   opensearch.share.common: shared general-purpose
             * *   opensearch.share.compute: shared computing
             * *   opensearch.share.storage: shared storage
             * *   opensearch.private.common: exclusive general-purpose
             * *   opensearch.private.compute: exclusive computing
             * *   opensearch.private.storage: exclusive storage
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            public Quota build() {
                return new Quota(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("algoDeploymentId")
        private Integer algoDeploymentId;

        @NameInMap("autoSwitch")
        private Boolean autoSwitch;

        @NameInMap("clusterName")
        private String clusterName;

        @NameInMap("created")
        private Integer created;

        @NameInMap("description")
        private String description;

        @NameInMap("domain")
        private Domain domain;

        @NameInMap("fetchFields")
        private java.util.List < String > fetchFields;

        @NameInMap("id")
        private String id;

        @NameInMap("progressPercent")
        private Integer progressPercent;

        @NameInMap("quota")
        private Quota quota;

        @NameInMap("schema")
        private java.util.Map < String, ? > schema;

        @NameInMap("status")
        private String status;

        @NameInMap("type")
        private String type;

        private Result(Builder builder) {
            this.algoDeploymentId = builder.algoDeploymentId;
            this.autoSwitch = builder.autoSwitch;
            this.clusterName = builder.clusterName;
            this.created = builder.created;
            this.description = builder.description;
            this.domain = builder.domain;
            this.fetchFields = builder.fetchFields;
            this.id = builder.id;
            this.progressPercent = builder.progressPercent;
            this.quota = builder.quota;
            this.schema = builder.schema;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return algoDeploymentId
         */
        public Integer getAlgoDeploymentId() {
            return this.algoDeploymentId;
        }

        /**
         * @return autoSwitch
         */
        public Boolean getAutoSwitch() {
            return this.autoSwitch;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return created
         */
        public Integer getCreated() {
            return this.created;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return domain
         */
        public Domain getDomain() {
            return this.domain;
        }

        /**
         * @return fetchFields
         */
        public java.util.List < String > getFetchFields() {
            return this.fetchFields;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return progressPercent
         */
        public Integer getProgressPercent() {
            return this.progressPercent;
        }

        /**
         * @return quota
         */
        public Quota getQuota() {
            return this.quota;
        }

        /**
         * @return schema
         */
        public java.util.Map < String, ? > getSchema() {
            return this.schema;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer algoDeploymentId; 
            private Boolean autoSwitch; 
            private String clusterName; 
            private Integer created; 
            private String description; 
            private Domain domain; 
            private java.util.List < String > fetchFields; 
            private String id; 
            private Integer progressPercent; 
            private Quota quota; 
            private java.util.Map < String, ? > schema; 
            private String status; 
            private String type; 

            /**
             * The ID of the created rough sort expression.
             */
            public Builder algoDeploymentId(Integer algoDeploymentId) {
                this.algoDeploymentId = algoDeploymentId;
                return this;
            }

            /**
             * Indicates whether the version is automatically published to the online environment.
             */
            public Builder autoSwitch(Boolean autoSwitch) {
                this.autoSwitch = autoSwitch;
                return this;
            }

            /**
             * clusterName.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * The timestamp when the version was created.
             */
            public Builder created(Integer created) {
                this.created = created;
                return this;
            }

            /**
             * The description of the version.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * domain.
             */
            public Builder domain(Domain domain) {
                this.domain = domain;
                return this;
            }

            /**
             * The default display fields.
             */
            public Builder fetchFields(java.util.List < String > fetchFields) {
                this.fetchFields = fetchFields;
                return this;
            }

            /**
             * The ID of the version.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The progress of data import, in percentage. For example, a value of 83 indicates 83%.
             */
            public Builder progressPercent(Integer progressPercent) {
                this.progressPercent = progressPercent;
                return this;
            }

            /**
             * The quota information about the version.
             */
            public Builder quota(Quota quota) {
                this.quota = quota;
                return this;
            }

            /**
             * The application schema.
             */
            public Builder schema(java.util.Map < String, ? > schema) {
                this.schema = schema;
                return this;
            }

            /**
             * The status of the version. Valid values:
             * <p>
             * 
             * *   ok
             * *   stopped
             * *   frozen
             * *   initializing
             * *   unavailable
             * *   data_waiting
             * *   data_preparing
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The type of the application. Valid values:
             * <p>
             * 
             * *   standard: a standard application.
             * *   advance: an advanced application which is of an old application type. New applications cannot be of this type.
             * *   enhanced: an advanced application which is of a new application type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
