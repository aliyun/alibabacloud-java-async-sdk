// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ListMaintainWindowsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMaintainWindowsResponseBody</p>
 */
public class ListMaintainWindowsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maintainWindowList")
    private java.util.List<MaintainWindowForView> maintainWindowList;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListMaintainWindowsResponseBody(Builder builder) {
        this.maintainWindowList = builder.maintainWindowList;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMaintainWindowsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maintainWindowList
     */
    public java.util.List<MaintainWindowForView> getMaintainWindowList() {
        return this.maintainWindowList;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<MaintainWindowForView> maintainWindowList; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListMaintainWindowsResponseBody model) {
            this.maintainWindowList = model.maintainWindowList;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * maintainWindowList.
         */
        public Builder maintainWindowList(java.util.List<MaintainWindowForView> maintainWindowList) {
            this.maintainWindowList = maintainWindowList;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>8FDE2569-626B-5176-9844-28877A*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListMaintainWindowsResponseBody build() {
            return new ListMaintainWindowsResponseBody(this);
        } 

    } 

}
