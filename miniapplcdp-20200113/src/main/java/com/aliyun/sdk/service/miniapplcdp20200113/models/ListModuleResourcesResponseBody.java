// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListModuleResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListModuleResourcesResponseBody</p>
 */
public class ListModuleResourcesResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private ListModuleResourcesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModuleResourcesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListModuleResourcesResponseBody build() {
            return new ListModuleResourcesResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("CommitId")
        private String commitId;

        @NameInMap("ModelData")
        private java.util.Map < String, String > modelData;

        @NameInMap("ModelDataPath")
        private java.util.Map < String, String > modelDataPath;

        @NameInMap("ModuleId")
        private String moduleId;

        @NameInMap("ResourceData")
        private java.util.Map < String, java.util.List<DataItemsResourceDataValue>> resourceData;

        @NameInMap("ResourceDataPath")
        private java.util.Map < String, String > resourceDataPath;

        private Items(Builder builder) {
            this.commitId = builder.commitId;
            this.modelData = builder.modelData;
            this.modelDataPath = builder.modelDataPath;
            this.moduleId = builder.moduleId;
            this.resourceData = builder.resourceData;
            this.resourceDataPath = builder.resourceDataPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return commitId
         */
        public String getCommitId() {
            return this.commitId;
        }

        /**
         * @return modelData
         */
        public java.util.Map < String, String > getModelData() {
            return this.modelData;
        }

        /**
         * @return modelDataPath
         */
        public java.util.Map < String, String > getModelDataPath() {
            return this.modelDataPath;
        }

        /**
         * @return moduleId
         */
        public String getModuleId() {
            return this.moduleId;
        }

        /**
         * @return resourceData
         */
        public java.util.Map < String, java.util.List<DataItemsResourceDataValue>> getResourceData() {
            return this.resourceData;
        }

        /**
         * @return resourceDataPath
         */
        public java.util.Map < String, String > getResourceDataPath() {
            return this.resourceDataPath;
        }

        public static final class Builder {
            private String commitId; 
            private java.util.Map < String, String > modelData; 
            private java.util.Map < String, String > modelDataPath; 
            private String moduleId; 
            private java.util.Map < String, java.util.List<DataItemsResourceDataValue>> resourceData; 
            private java.util.Map < String, String > resourceDataPath; 

            /**
             * CommitId.
             */
            public Builder commitId(String commitId) {
                this.commitId = commitId;
                return this;
            }

            /**
             * ModelData.
             */
            public Builder modelData(java.util.Map < String, String > modelData) {
                this.modelData = modelData;
                return this;
            }

            /**
             * ModelDataPath.
             */
            public Builder modelDataPath(java.util.Map < String, String > modelDataPath) {
                this.modelDataPath = modelDataPath;
                return this;
            }

            /**
             * ModuleId.
             */
            public Builder moduleId(String moduleId) {
                this.moduleId = moduleId;
                return this;
            }

            /**
             * ResourceData.
             */
            public Builder resourceData(java.util.Map < String, java.util.List<DataItemsResourceDataValue>> resourceData) {
                this.resourceData = resourceData;
                return this;
            }

            /**
             * ResourceDataPath.
             */
            public Builder resourceDataPath(java.util.Map < String, String > resourceDataPath) {
                this.resourceDataPath = resourceDataPath;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Items")
        private java.util.List < Items> items;

        private Data(Builder builder) {
            this.items = builder.items;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List < Items> getItems() {
            return this.items;
        }

        public static final class Builder {
            private java.util.List < Items> items; 

            /**
             * Items.
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
