// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListImageBuildRiskItemResponseBody} extends {@link TeaModel}
 *
 * <p>ListImageBuildRiskItemResponseBody</p>
 */
public class ListImageBuildRiskItemResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    private ListImageBuildRiskItemResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListImageBuildRiskItemResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * The data returned.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListImageBuildRiskItemResponseBody build() {
            return new ListImageBuildRiskItemResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ItemKey")
        private String itemKey;

        @NameInMap("ItemName")
        private String itemName;

        private Data(Builder builder) {
            this.itemKey = builder.itemKey;
            this.itemName = builder.itemName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return itemKey
         */
        public String getItemKey() {
            return this.itemKey;
        }

        /**
         * @return itemName
         */
        public String getItemName() {
            return this.itemName;
        }

        public static final class Builder {
            private String itemKey; 
            private String itemName; 

            /**
             * The key of the name for the image build risk item.
             */
            public Builder itemKey(String itemKey) {
                this.itemKey = itemKey;
                return this;
            }

            /**
             * The name of the name for the image build risk item.
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
