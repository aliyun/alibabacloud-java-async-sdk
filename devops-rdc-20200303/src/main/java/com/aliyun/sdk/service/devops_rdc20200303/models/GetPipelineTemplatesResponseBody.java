// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPipelineTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>GetPipelineTemplatesResponseBody</p>
 */
public class GetPipelineTemplatesResponseBody extends TeaModel {
    @NameInMap("Object")
    private Object object;

    @NameInMap("RequestId")
    private String requestId;

    private GetPipelineTemplatesResponseBody(Builder builder) {
        this.object = builder.object;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPipelineTemplatesResponseBody create() {
        return builder().build();
    }

    /**
     * @return object
     */
    public Object getObject() {
        return this.object;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Object object; 
        private String requestId; 

        /**
         * Object.
         */
        public Builder object(Object object) {
            this.object = object;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPipelineTemplatesResponseBody build() {
            return new GetPipelineTemplatesResponseBody(this);
        } 

    } 

    public static class DataList extends TeaModel {
        @NameInMap("Id")
        private Float id;

        @NameInMap("TemplateName")
        private String templateName;

        private DataList(Builder builder) {
            this.id = builder.id;
            this.templateName = builder.templateName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Float getId() {
            return this.id;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        public static final class Builder {
            private Float id; 
            private String templateName; 

            /**
             * Id.
             */
            public Builder id(Float id) {
                this.id = id;
                return this;
            }

            /**
             * TemplateName.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
    public static class Object extends TeaModel {
        @NameInMap("DataList")
        private java.util.List < DataList> dataList;

        @NameInMap("Total")
        private Float total;

        private Object(Builder builder) {
            this.dataList = builder.dataList;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Object create() {
            return builder().build();
        }

        /**
         * @return dataList
         */
        public java.util.List < DataList> getDataList() {
            return this.dataList;
        }

        /**
         * @return total
         */
        public Float getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < DataList> dataList; 
            private Float total; 

            /**
             * DataList.
             */
            public Builder dataList(java.util.List < DataList> dataList) {
                this.dataList = dataList;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Float total) {
                this.total = total;
                return this;
            }

            public Object build() {
                return new Object(this);
            } 

        } 

    }
}
