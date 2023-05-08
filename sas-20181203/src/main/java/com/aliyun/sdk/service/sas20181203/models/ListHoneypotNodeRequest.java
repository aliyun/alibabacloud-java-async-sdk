// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHoneypotNodeRequest} extends {@link RequestModel}
 *
 * <p>ListHoneypotNodeRequest</p>
 */
public class ListHoneypotNodeRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("NodeId")
    private String nodeId;

    @Query
    @NameInMap("NodeName")
    private String nodeName;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    private ListHoneypotNodeRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.nodeId = builder.nodeId;
        this.nodeName = builder.nodeName;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHoneypotNodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return nodeName
     */
    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListHoneypotNodeRequest, Builder> {
        private Integer currentPage; 
        private String nodeId; 
        private String nodeName; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListHoneypotNodeRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.nodeId = request.nodeId;
            this.nodeName = request.nodeName;
            this.pageSize = request.pageSize;
        } 

        /**
         * The allowed CIDR block.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The status code returned. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * The name of the management node.
         */
        public Builder nodeName(String nodeName) {
            this.putQueryParameter("NodeName", nodeName);
            this.nodeName = nodeName;
            return this;
        }

        /**
         * The time when the management node was created.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListHoneypotNodeRequest build() {
            return new ListHoneypotNodeRequest(this);
        } 

    } 

}
