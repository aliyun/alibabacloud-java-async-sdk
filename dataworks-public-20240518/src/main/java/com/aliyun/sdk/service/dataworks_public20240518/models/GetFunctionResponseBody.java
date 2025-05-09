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
 * {@link GetFunctionResponseBody} extends {@link TeaModel}
 *
 * <p>GetFunctionResponseBody</p>
 */
public class GetFunctionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Function")
    private Function function;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetFunctionResponseBody(Builder builder) {
        this.function = builder.function;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFunctionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return function
     */
    public Function getFunction() {
        return this.function;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Function function; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetFunctionResponseBody model) {
            this.function = model.function;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the UDF.</p>
         */
        public Builder function(Function function) {
            this.function = function;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6CF95929-6D12-5A88-8CC3-4B2F4C2EXXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetFunctionResponseBody build() {
            return new GetFunctionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFunctionResponseBody} extends {@link TeaModel}
     *
     * <p>GetFunctionResponseBody</p>
     */
    public static class Function extends TeaModel {
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

        private Function(Builder builder) {
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

        public static Function create() {
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

            private Builder() {
            } 

            private Builder(Function model) {
                this.createTime = model.createTime;
                this.id = model.id;
                this.modifyTime = model.modifyTime;
                this.name = model.name;
                this.owner = model.owner;
                this.projectId = model.projectId;
                this.spec = model.spec;
            } 

            /**
             * <p>The time when the UDF was created. This value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1724505917000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the UDF.</p>
             * 
             * <strong>example:</strong>
             * <p>860438872620113XXXX</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The time when the UDF was last modified. This value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1724506661000</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The name of the UDF.</p>
             * 
             * <strong>example:</strong>
             * <p>Function name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The owner of the UDF.</p>
             * 
             * <strong>example:</strong>
             * <p>110755000425XXXX</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The ID of the DataWorks workspace to which the UDF belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The FlowSpec field information about the UDF. For more information, see <a href="https://github.com/aliyun/dataworks-spec/blob/master/README_zh_CN.md">FlowSpec</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;version&quot;: &quot;1.1.0&quot;,
             *     &quot;kind&quot;: &quot;Function&quot;,
             *     &quot;spec&quot;: {
             *         &quot;functions&quot;: [
             *             {
             *                 &quot;name&quot;: &quot;Function_Name&quot;,
             *                 &quot;id&quot;: &quot;580667964888595XXXX&quot;,
             *                 &quot;script&quot;: {
             *                     &quot;content&quot;: &quot;{  &quot;uuid&quot;: &quot;580667964888595XXXX&quot;,  &quot;name&quot;: &quot;Function_Name&quot;,  &quot;datasource&quot;: {    &quot;type&quot;: &quot;odps&quot;,    &quot;name&quot;: &quot;odps_first&quot;  },  &quot;runtimeResource&quot;: {    &quot;resourceGroup&quot;: &quot;S_res_group_XXXX_XXXX&quot;,    &quot;resourceGroupId&quot;: 6591XXXX  }}&quot;,
             *                     &quot;path&quot;: &quot;XXX/OpenAPI/Function/Function_Name&quot;,
             *                     &quot;runtime&quot;: {
             *                         &quot;command&quot;: &quot;ODPS_FUNCTION&quot;
             *                     }
             *                 },
             *                 &quot;datasource&quot;: {
             *                     &quot;name&quot;: &quot;odps_first&quot;,
             *                     &quot;type&quot;: &quot;odps&quot;
             *                 },
             *                 &quot;runtimeResource&quot;: {
             *                     &quot;resourceGroup&quot;: &quot;S_res_group_XXXX_XXXX&quot;,
             *                     &quot;id&quot;: &quot;723932906364267XXXX&quot;,
             *                     &quot;resourceGroupId&quot;: &quot;6591XXXX&quot;
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

            public Function build() {
                return new Function(this);
            } 

        } 

    }
}
