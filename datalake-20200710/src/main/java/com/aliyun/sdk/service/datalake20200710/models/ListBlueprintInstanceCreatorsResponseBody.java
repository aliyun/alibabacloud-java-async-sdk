// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBlueprintInstanceCreatorsResponseBody} extends {@link TeaModel}
 *
 * <p>ListBlueprintInstanceCreatorsResponseBody</p>
 */
public class ListBlueprintInstanceCreatorsResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListBlueprintInstanceCreatorsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBlueprintInstanceCreatorsResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListBlueprintInstanceCreatorsResponseBody build() {
            return new ListBlueprintInstanceCreatorsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Creator")
        private String creator;

        @NameInMap("CreatorLoginName")
        private String creatorLoginName;

        private Data(Builder builder) {
            this.creator = builder.creator;
            this.creatorLoginName = builder.creatorLoginName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return creatorLoginName
         */
        public String getCreatorLoginName() {
            return this.creatorLoginName;
        }

        public static final class Builder {
            private String creator; 
            private String creatorLoginName; 

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * CreatorLoginName.
             */
            public Builder creatorLoginName(String creatorLoginName) {
                this.creatorLoginName = creatorLoginName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
