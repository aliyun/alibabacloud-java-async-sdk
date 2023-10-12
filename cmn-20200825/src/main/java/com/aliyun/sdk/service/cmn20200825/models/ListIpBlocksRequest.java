// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIpBlocksRequest} extends {@link RequestModel}
 *
 * <p>ListIpBlocksRequest</p>
 */
public class ListIpBlocksRequest extends Request {
    @Query
    @NameInMap("BottomNode")
    private Boolean bottomNode;

    @Query
    @NameInMap("Category")
    private String category;

    @Query
    @NameInMap("ExtAttributes")
    private java.util.Map < String, ? > extAttributes;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Ip")
    private String ip;

    @Query
    @NameInMap("IpBlockCode")
    private String ipBlockCode;

    @Query
    @NameInMap("IpList")
    private java.util.List < String > ipList;

    @Query
    @NameInMap("LeafNode")
    private Boolean leafNode;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 100)
    private Integer maxResults;

    @Query
    @NameInMap("NetBusiness")
    private String netBusiness;

    @Query
    @NameInMap("NetType")
    private String netType;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("ParentUid")
    private String parentUid;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("SubNetBusiness")
    private String subNetBusiness;

    @Query
    @NameInMap("TopParent")
    private Boolean topParent;

    @Query
    @NameInMap("TreeType")
    private Boolean treeType;

    @Query
    @NameInMap("ZoneName")
    private String zoneName;

    private ListIpBlocksRequest(Builder builder) {
        super(builder);
        this.bottomNode = builder.bottomNode;
        this.category = builder.category;
        this.extAttributes = builder.extAttributes;
        this.instanceId = builder.instanceId;
        this.ip = builder.ip;
        this.ipBlockCode = builder.ipBlockCode;
        this.ipList = builder.ipList;
        this.leafNode = builder.leafNode;
        this.maxResults = builder.maxResults;
        this.netBusiness = builder.netBusiness;
        this.netType = builder.netType;
        this.nextToken = builder.nextToken;
        this.parentUid = builder.parentUid;
        this.status = builder.status;
        this.subNetBusiness = builder.subNetBusiness;
        this.topParent = builder.topParent;
        this.treeType = builder.treeType;
        this.zoneName = builder.zoneName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIpBlocksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bottomNode
     */
    public Boolean getBottomNode() {
        return this.bottomNode;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return extAttributes
     */
    public java.util.Map < String, ? > getExtAttributes() {
        return this.extAttributes;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return ipBlockCode
     */
    public String getIpBlockCode() {
        return this.ipBlockCode;
    }

    /**
     * @return ipList
     */
    public java.util.List < String > getIpList() {
        return this.ipList;
    }

    /**
     * @return leafNode
     */
    public Boolean getLeafNode() {
        return this.leafNode;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return netBusiness
     */
    public String getNetBusiness() {
        return this.netBusiness;
    }

    /**
     * @return netType
     */
    public String getNetType() {
        return this.netType;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return parentUid
     */
    public String getParentUid() {
        return this.parentUid;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return subNetBusiness
     */
    public String getSubNetBusiness() {
        return this.subNetBusiness;
    }

    /**
     * @return topParent
     */
    public Boolean getTopParent() {
        return this.topParent;
    }

    /**
     * @return treeType
     */
    public Boolean getTreeType() {
        return this.treeType;
    }

    /**
     * @return zoneName
     */
    public String getZoneName() {
        return this.zoneName;
    }

    public static final class Builder extends Request.Builder<ListIpBlocksRequest, Builder> {
        private Boolean bottomNode; 
        private String category; 
        private java.util.Map < String, ? > extAttributes; 
        private String instanceId; 
        private String ip; 
        private String ipBlockCode; 
        private java.util.List < String > ipList; 
        private Boolean leafNode; 
        private Integer maxResults; 
        private String netBusiness; 
        private String netType; 
        private String nextToken; 
        private String parentUid; 
        private String status; 
        private String subNetBusiness; 
        private Boolean topParent; 
        private Boolean treeType; 
        private String zoneName; 

        private Builder() {
            super();
        } 

        private Builder(ListIpBlocksRequest request) {
            super(request);
            this.bottomNode = request.bottomNode;
            this.category = request.category;
            this.extAttributes = request.extAttributes;
            this.instanceId = request.instanceId;
            this.ip = request.ip;
            this.ipBlockCode = request.ipBlockCode;
            this.ipList = request.ipList;
            this.leafNode = request.leafNode;
            this.maxResults = request.maxResults;
            this.netBusiness = request.netBusiness;
            this.netType = request.netType;
            this.nextToken = request.nextToken;
            this.parentUid = request.parentUid;
            this.status = request.status;
            this.subNetBusiness = request.subNetBusiness;
            this.topParent = request.topParent;
            this.treeType = request.treeType;
            this.zoneName = request.zoneName;
        } 

        /**
         * BottomNode.
         */
        public Builder bottomNode(Boolean bottomNode) {
            this.putQueryParameter("BottomNode", bottomNode);
            this.bottomNode = bottomNode;
            return this;
        }

        /**
         * Category.
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * ExtAttributes.
         */
        public Builder extAttributes(java.util.Map < String, ? > extAttributes) {
            String extAttributesShrink = shrink(extAttributes, "ExtAttributes", "json");
            this.putQueryParameter("ExtAttributes", extAttributesShrink);
            this.extAttributes = extAttributes;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Ip.
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * IpBlockCode.
         */
        public Builder ipBlockCode(String ipBlockCode) {
            this.putQueryParameter("IpBlockCode", ipBlockCode);
            this.ipBlockCode = ipBlockCode;
            return this;
        }

        /**
         * IpList.
         */
        public Builder ipList(java.util.List < String > ipList) {
            String ipListShrink = shrink(ipList, "IpList", "json");
            this.putQueryParameter("IpList", ipListShrink);
            this.ipList = ipList;
            return this;
        }

        /**
         * LeafNode.
         */
        public Builder leafNode(Boolean leafNode) {
            this.putQueryParameter("LeafNode", leafNode);
            this.leafNode = leafNode;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NetBusiness.
         */
        public Builder netBusiness(String netBusiness) {
            this.putQueryParameter("NetBusiness", netBusiness);
            this.netBusiness = netBusiness;
            return this;
        }

        /**
         * NetType.
         */
        public Builder netType(String netType) {
            this.putQueryParameter("NetType", netType);
            this.netType = netType;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * ParentUid.
         */
        public Builder parentUid(String parentUid) {
            this.putQueryParameter("ParentUid", parentUid);
            this.parentUid = parentUid;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * SubNetBusiness.
         */
        public Builder subNetBusiness(String subNetBusiness) {
            this.putQueryParameter("SubNetBusiness", subNetBusiness);
            this.subNetBusiness = subNetBusiness;
            return this;
        }

        /**
         * TopParent.
         */
        public Builder topParent(Boolean topParent) {
            this.putQueryParameter("TopParent", topParent);
            this.topParent = topParent;
            return this;
        }

        /**
         * TreeType.
         */
        public Builder treeType(Boolean treeType) {
            this.putQueryParameter("TreeType", treeType);
            this.treeType = treeType;
            return this;
        }

        /**
         * ZoneName.
         */
        public Builder zoneName(String zoneName) {
            this.putQueryParameter("ZoneName", zoneName);
            this.zoneName = zoneName;
            return this;
        }

        @Override
        public ListIpBlocksRequest build() {
            return new ListIpBlocksRequest(this);
        } 

    } 

}
