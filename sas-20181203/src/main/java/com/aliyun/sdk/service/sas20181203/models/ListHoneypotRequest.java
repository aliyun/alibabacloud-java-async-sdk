// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListHoneypotRequest} extends {@link RequestModel}
 *
 * <p>ListHoneypotRequest</p>
 */
public class ListHoneypotRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HoneypotIds")
    private java.util.List < String > honeypotIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HoneypotName")
    private String honeypotName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeName")
    private String nodeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    private ListHoneypotRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.honeypotIds = builder.honeypotIds;
        this.honeypotName = builder.honeypotName;
        this.nodeId = builder.nodeId;
        this.nodeName = builder.nodeName;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHoneypotRequest create() {
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
     * @return honeypotIds
     */
    public java.util.List < String > getHoneypotIds() {
        return this.honeypotIds;
    }

    /**
     * @return honeypotName
     */
    public String getHoneypotName() {
        return this.honeypotName;
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

    public static final class Builder extends Request.Builder<ListHoneypotRequest, Builder> {
        private Integer currentPage; 
        private java.util.List < String > honeypotIds; 
        private String honeypotName; 
        private String nodeId; 
        private String nodeName; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListHoneypotRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.honeypotIds = request.honeypotIds;
            this.honeypotName = request.honeypotName;
            this.nodeId = request.nodeId;
            this.nodeName = request.nodeName;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The number of the page to return.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The IDs of the honeypots.</p>
         */
        public Builder honeypotIds(java.util.List < String > honeypotIds) {
            this.putQueryParameter("HoneypotIds", honeypotIds);
            this.honeypotIds = honeypotIds;
            return this;
        }

        /**
         * <p>The name of the honeypot.</p>
         * 
         * <strong>example:</strong>
         * <p>mx-rouyi</p>
         */
        public Builder honeypotName(String honeypotName) {
            this.putQueryParameter("HoneypotName", honeypotName);
            this.honeypotName = honeypotName;
            return this;
        }

        /**
         * <p>The ID of the management node.</p>
         * 
         * <strong>example:</strong>
         * <p>a882e590-b87b-45a6-87b9-d0a3e5a0****</p>
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>The name of the management node.</p>
         * 
         * <strong>example:</strong>
         * <p>honeypot_master</p>
         */
        public Builder nodeName(String nodeName) {
            this.putQueryParameter("NodeName", nodeName);
            this.nodeName = nodeName;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListHoneypotRequest build() {
            return new ListHoneypotRequest(this);
        } 

    } 

}
