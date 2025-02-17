// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetResourceResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceResponseBody</p>
 */
public class GetResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Resource")
    private Resource resource;

    private GetResourceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resource = builder.resource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resource
     */
    public Resource getResource() {
        return this.resource;
    }

    public static final class Builder {
        private String requestId; 
        private Resource resource; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E871F6C0-2EFF-5790-A00D-C57543EEXXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the file resource.</p>
         */
        public Builder resource(Resource resource) {
            this.resource = resource;
            return this;
        }

        public GetResourceResponseBody build() {
            return new GetResourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetResourceResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceResponseBody</p>
     */
    public static class Resource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private String spec;

        private Resource(Builder builder) {
            this.createTime = builder.createTime;
            this.id = builder.id;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.owner = builder.owner;
            this.projectId = builder.projectId;
            this.spec = builder.spec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resource create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        public static final class Builder {
            private Long createTime; 
            private Long id; 
            private Long modifyTime; 
            private String name; 
            private String owner; 
            private Long projectId; 
            private String spec; 

            /**
             * <p>The time when the file resource was created. This value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1700539206000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the file resource.</p>
             * 
             * <strong>example:</strong>
             * <p>860438872620113XXXX</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The time when the file resource was last modified. This value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1700539206000</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The name of the file resource.</p>
             * 
             * <strong>example:</strong>
             * <p>OpenAPI_Test_Resource. py</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The owner of the file resource.</p>
             * 
             * <strong>example:</strong>
             * <p>110755000425XXXX</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The ID of the workspace to which the file resource belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The FlowSpec field information about the file resource. For more information, see <a href="https://github.com/aliyun/alibabacloud-dataworks-tool-dflow">FlowSpec</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;version&quot;: &quot;1.1.0&quot;,
             *     &quot;kind&quot;: &quot;Resource&quot;,
             *     &quot;spec&quot;: {
             *         &quot;fileResources&quot;: [
             *             {
             *                 &quot;name&quot;: &quot;OpenAPI_Test_Resource.py&quot;,
             *                 &quot;id&quot;: &quot;631478864897630XXXX&quot;,
             *                 &quot;script&quot;: {
             *                     &quot;content&quot;: &quot;&quot;,
             *                     &quot;path&quot;: &quot;XX/OpenAPI_Test/Resource_Test/OpenAPI_Test_Resource.py&quot;,
             *                     &quot;runtime&quot;: {
             *                         &quot;command&quot;: &quot;ODPS_PYTHON&quot;
             *                     }
             *                 },
             *                 &quot;type&quot;: &quot;python&quot;,
             *                 &quot;file&quot;: {
             *                     &quot;storage&quot;: {}
             *                 },
             *                 &quot;datasource&quot;: {
             *                     &quot;name&quot;: &quot;odps_first&quot;,
             *                     &quot;type&quot;: &quot;odps&quot;
             *                 },
             *                 &quot;metadata&quot;: {
             *                     &quot;owner&quot;: &quot;110755000425XXXX&quot;
             *                 }
             *             }
             *         ]
             *     }
             * }</p>
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            public Resource build() {
                return new Resource(this);
            } 

        } 

    }
}
