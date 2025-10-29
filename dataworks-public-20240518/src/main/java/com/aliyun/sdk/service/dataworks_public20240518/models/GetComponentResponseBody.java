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
 * {@link GetComponentResponseBody} extends {@link TeaModel}
 *
 * <p>GetComponentResponseBody</p>
 */
public class GetComponentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Component")
    private Component component;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetComponentResponseBody(Builder builder) {
        this.component = builder.component;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetComponentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return component
     */
    public Component getComponent() {
        return this.component;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Component component; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetComponentResponseBody model) {
            this.component = model.component;
            this.requestId = model.requestId;
        } 

        /**
         * <p>JSON serialization of the component module.</p>
         */
        public Builder component(Component component) {
            this.component = component;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>0000-ABCD-EFG****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetComponentResponseBody build() {
            return new GetComponentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetComponentResponseBody} extends {@link TeaModel}
     *
     * <p>GetComponentResponseBody</p>
     */
    public static class Component extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentId")
        private String componentId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private String spec;

        private Component(Builder builder) {
            this.componentId = builder.componentId;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.owner = builder.owner;
            this.projectId = builder.projectId;
            this.regionId = builder.regionId;
            this.spec = builder.spec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Component create() {
            return builder().build();
        }

        /**
         * @return componentId
         */
        public String getComponentId() {
            return this.componentId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        public static final class Builder {
            private String componentId; 
            private String createTime; 
            private String description; 
            private String modifyTime; 
            private String name; 
            private String owner; 
            private Long projectId; 
            private String regionId; 
            private String spec; 

            private Builder() {
            } 

            private Builder(Component model) {
                this.componentId = model.componentId;
                this.createTime = model.createTime;
                this.description = model.description;
                this.modifyTime = model.modifyTime;
                this.name = model.name;
                this.owner = model.owner;
                this.projectId = model.projectId;
                this.regionId = model.regionId;
                this.spec = model.spec;
            } 

            /**
             * <p>The ID of the dataset acceleration component. For information on how to obtain the component ID, see <a href="https://help.aliyun.com/document_detail/2979566.html">ListComponents</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>43cd873b-235c-44f8-be07-e4d4cf7e73b0</p>
             */
            public Builder componentId(String componentId) {
                this.componentId = componentId;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
             * 
             * <strong>example:</strong>
             * <p>2017-04-27T05:37:05Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The modification time (millisecond-level timestamp).</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-26T07:44:21Z</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>Parameter</p>
             * 
             * <strong>example:</strong>
             * <p>dim_whse_epet_warehouse_jz_storage_stock_lot_relation_id</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the task owner.</p>
             * 
             * <strong>example:</strong>
             * <p>207316543660665792</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The DataWorks workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>64623</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The region ID, such as ap-southeast-1. The region ID is automatically parsed from your endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The FlowSpec information for this workflow. For more information, see <a href="https://github.com/aliyun/alibabacloud-dataworks-tool-dflow/">FlowSpec</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;kind&quot;: &quot;Component&quot;,
             *     &quot;name&quot;: &quot;com1&quot;,
             *     &quot;spec&quot;: {
             *         &quot;components&quot;: [
             *             {
             *                 &quot;name&quot;: &quot;test11&quot;,
             *                 &quot;id&quot;: &quot;8196828925037*****&quot;,
             *                 &quot;owner&quot;: &quot;054664&quot;,
             *                 &quot;description&quot;: &quot;&quot;,
             *                 &quot;script&quot;: {
             *                     &quot;language&quot;: &quot;odps-sql&quot;,
             *                     &quot;path&quot;: &quot;test11&quot;,
             *                     &quot;content&quot;: &quot;select &quot;@@{bizdate}&quot;, &quot;@@{my_input_table}&quot;&quot;,
             *                     &quot;runtime&quot;: {
             *                         &quot;command&quot;: &quot;SQL_COMPONENT&quot;
             *                     }
             *                 },
             *                 &quot;inputs&quot;: [
             *                     {
             *                         &quot;name&quot;: &quot;bizdate&quot;,
             *                         &quot;type&quot;: &quot;string&quot;
             *                     },
             *                     {
             *                         &quot;name&quot;: &quot;my_input_table&quot;,
             *                         &quot;type&quot;: &quot;string&quot;
             *                     }
             *                 ],
             *                 &quot;outputs&quot;: [
             *                     {
             *                         &quot;name&quot;: &quot;my_output_table1&quot;,
             *                         &quot;type&quot;: &quot;string&quot;
             *                     }
             *                 ]
             *             }
             *         ]
             *     }
             * }</p>
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            public Component build() {
                return new Component(this);
            } 

        } 

    }
}
