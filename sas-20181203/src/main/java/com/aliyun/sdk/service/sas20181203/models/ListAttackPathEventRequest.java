// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListAttackPathEventRequest} extends {@link RequestModel}
 *
 * <p>ListAttackPathEventRequest</p>
 */
public class ListAttackPathEventRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttackPathAssetList")
    private java.util.List<AttackPathAssetList> attackPathAssetList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 200)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PathNameDesc")
    private String pathNameDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PathType")
    private String pathType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskLevelList")
    private java.util.List<String> riskLevelList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private ListAttackPathEventRequest(Builder builder) {
        super(builder);
        this.attackPathAssetList = builder.attackPathAssetList;
        this.currentPage = builder.currentPage;
        this.endTime = builder.endTime;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.pathNameDesc = builder.pathNameDesc;
        this.pathType = builder.pathType;
        this.riskLevelList = builder.riskLevelList;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAttackPathEventRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attackPathAssetList
     */
    public java.util.List<AttackPathAssetList> getAttackPathAssetList() {
        return this.attackPathAssetList;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pathNameDesc
     */
    public String getPathNameDesc() {
        return this.pathNameDesc;
    }

    /**
     * @return pathType
     */
    public String getPathType() {
        return this.pathType;
    }

    /**
     * @return riskLevelList
     */
    public java.util.List<String> getRiskLevelList() {
        return this.riskLevelList;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListAttackPathEventRequest, Builder> {
        private java.util.List<AttackPathAssetList> attackPathAssetList; 
        private Integer currentPage; 
        private Long endTime; 
        private String lang; 
        private Integer pageSize; 
        private String pathNameDesc; 
        private String pathType; 
        private java.util.List<String> riskLevelList; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListAttackPathEventRequest request) {
            super(request);
            this.attackPathAssetList = request.attackPathAssetList;
            this.currentPage = request.currentPage;
            this.endTime = request.endTime;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.pathNameDesc = request.pathNameDesc;
            this.pathType = request.pathType;
            this.riskLevelList = request.riskLevelList;
            this.startTime = request.startTime;
        } 

        /**
         * <p>List of cloud product assets in the attack path.</p>
         */
        public Builder attackPathAssetList(java.util.List<AttackPathAssetList> attackPathAssetList) {
            this.putQueryParameter("AttackPathAssetList", attackPathAssetList);
            this.attackPathAssetList = attackPathAssetList;
            return this;
        }

        /**
         * <p>Specifies from which page of the returned results the query results should be displayed. The default value is 1, indicating that the display starts from the first page.</p>
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
         * <p>Timestamp of the end time. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1668064495000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Sets the language type for requests and received messages, with the default being <strong>zh</strong>. Values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The maximum number of data entries displayed per page in a paginated query. The default value is <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Description of the path name.</p>
         * <blockquote>
         * <p>You can call <a href="~~ListAvailableAttackPath~~">ListAvailableAttackPath</a> to query the path name description.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ECS Instance Can Obtain Long-term Access Credential by Enabling Console Logon for RAM User</p>
         */
        public Builder pathNameDesc(String pathNameDesc) {
            this.putQueryParameter("PathNameDesc", pathNameDesc);
            this.pathNameDesc = pathNameDesc;
            return this;
        }

        /**
         * <p>Path type.</p>
         * <blockquote>
         * <p>You can call <a href="~~ListAvailableAttackPath~~">ListAvailableAttackPath</a> to query the path type.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>role_escalation</p>
         */
        public Builder pathType(String pathType) {
            this.putQueryParameter("PathType", pathType);
            this.pathType = pathType;
            return this;
        }

        /**
         * <p>List of risk level information.</p>
         */
        public Builder riskLevelList(java.util.List<String> riskLevelList) {
            this.putQueryParameter("RiskLevelList", riskLevelList);
            this.riskLevelList = riskLevelList;
            return this;
        }

        /**
         * <p>Timestamp of the start time. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1666886400000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListAttackPathEventRequest build() {
            return new ListAttackPathEventRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListAttackPathEventRequest} extends {@link TeaModel}
     *
     * <p>ListAttackPathEventRequest</p>
     */
    public static class AttackPathAssetList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetSubType")
        private Integer assetSubType;

        @com.aliyun.core.annotation.NameInMap("AssetType")
        private Integer assetType;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private Integer vendor;

        private AttackPathAssetList(Builder builder) {
            this.assetSubType = builder.assetSubType;
            this.assetType = builder.assetType;
            this.nodeType = builder.nodeType;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttackPathAssetList create() {
            return builder().build();
        }

        /**
         * @return assetSubType
         */
        public Integer getAssetSubType() {
            return this.assetSubType;
        }

        /**
         * @return assetType
         */
        public Integer getAssetType() {
            return this.assetType;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return vendor
         */
        public Integer getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private Integer assetSubType; 
            private Integer assetType; 
            private String nodeType; 
            private Integer vendor; 

            private Builder() {
            } 

            private Builder(AttackPathAssetList model) {
                this.assetSubType = model.assetSubType;
                this.assetType = model.assetType;
                this.nodeType = model.nodeType;
                this.vendor = model.vendor;
            } 

            /**
             * <p>Subtype of the cloud product asset.</p>
             * <blockquote>
             * <p>You can call <a href="~~ListSupportAttackPathAsset~~">ListSupportAttackPathAsset</a> to query the subtype of the cloud product asset.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder assetSubType(Integer assetSubType) {
                this.assetSubType = assetSubType;
                return this;
            }

            /**
             * <p>Type of the cloud product asset.</p>
             * <blockquote>
             * <p>You can call <a href="~~ListSupportAttackPathAsset~~">ListSupportAttackPathAsset</a> to query the type of the cloud product asset.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>17</p>
             */
            public Builder assetType(Integer assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * <p>Node type, values:</p>
             * <ul>
             * <li><strong>start</strong>: start point.</li>
             * <li><strong>end</strong>: end point.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>start</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>Vendor of the cloud product asset.</p>
             * <blockquote>
             * <p>You can call <a href="~~ListSupportAttackPathAsset~~">ListSupportAttackPathAsset</a> to query the vendor of the cloud product asset.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder vendor(Integer vendor) {
                this.vendor = vendor;
                return this;
            }

            public AttackPathAssetList build() {
                return new AttackPathAssetList(this);
            } 

        } 

    }
}
