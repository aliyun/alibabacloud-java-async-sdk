// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RequestServiceOfCloudDBAResponseBody} extends {@link TeaModel}
 *
 * <p>RequestServiceOfCloudDBAResponseBody</p>
 */
public class RequestServiceOfCloudDBAResponseBody extends TeaModel {
    @NameInMap("AttrData")
    private String attrData;

    @NameInMap("ListData")
    private String listData;

    @NameInMap("RequestId")
    private String requestId;

    private RequestServiceOfCloudDBAResponseBody(Builder builder) {
        this.attrData = builder.attrData;
        this.listData = builder.listData;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RequestServiceOfCloudDBAResponseBody create() {
        return builder().build();
    }

    /**
     * @return attrData
     */
    public String getAttrData() {
        return this.attrData;
    }

    /**
     * @return listData
     */
    public String getListData() {
        return this.listData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String attrData; 
        private String listData; 
        private String requestId; 

        /**
         * AttrData.
         */
        public Builder attrData(String attrData) {
            this.attrData = attrData;
            return this;
        }

        /**
         * ListData.
         */
        public Builder listData(String listData) {
            this.listData = listData;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RequestServiceOfCloudDBAResponseBody build() {
            return new RequestServiceOfCloudDBAResponseBody(this);
        } 

    } 

}
