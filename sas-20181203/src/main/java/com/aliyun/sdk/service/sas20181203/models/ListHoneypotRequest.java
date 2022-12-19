// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHoneypotRequest} extends {@link RequestModel}
 *
 * <p>ListHoneypotRequest</p>
 */
public class ListHoneypotRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("HoneypotIds")
    private java.util.List < String > honeypotIds;

    @Query
    @NameInMap("HoneypotName")
    private String honeypotName;

    @Query
    @NameInMap("NodeId")
    private String nodeId;

    @Query
    @NameInMap("NodeName")
    private String nodeName;

    @Query
    @NameInMap("PageSize")
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
         * The number of the page to return.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The IDs of honeypots.
         */
        public Builder honeypotIds(java.util.List < String > honeypotIds) {
            this.putQueryParameter("HoneypotIds", honeypotIds);
            this.honeypotIds = honeypotIds;
            return this;
        }

        /**
         * The name of the honeypot.
         */
        public Builder honeypotName(String honeypotName) {
            this.putQueryParameter("HoneypotName", honeypotName);
            this.honeypotName = honeypotName;
            return this;
        }

        /**
         * The ID of the management node to which the honeypot belongs.
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * The name of the management node to which the honeypot belongs.
         */
        public Builder nodeName(String nodeName) {
            this.putQueryParameter("NodeName", nodeName);
            this.nodeName = nodeName;
            return this;
        }

        /**
         * The number of entries to return on each page.
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
