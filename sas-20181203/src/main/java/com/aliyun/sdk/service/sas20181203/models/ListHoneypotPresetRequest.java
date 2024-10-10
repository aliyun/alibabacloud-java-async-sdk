// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListHoneypotPresetRequest} extends {@link RequestModel}
 *
 * <p>ListHoneypotPresetRequest</p>
 */
public class ListHoneypotPresetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HoneypotImageName")
    private String honeypotImageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeName")
    private String nodeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PresetName")
    private String presetName;

    private ListHoneypotPresetRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.honeypotImageName = builder.honeypotImageName;
        this.lang = builder.lang;
        this.nodeId = builder.nodeId;
        this.nodeName = builder.nodeName;
        this.pageSize = builder.pageSize;
        this.presetName = builder.presetName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHoneypotPresetRequest create() {
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
     * @return honeypotImageName
     */
    public String getHoneypotImageName() {
        return this.honeypotImageName;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
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

    /**
     * @return presetName
     */
    public String getPresetName() {
        return this.presetName;
    }

    public static final class Builder extends Request.Builder<ListHoneypotPresetRequest, Builder> {
        private Integer currentPage; 
        private String honeypotImageName; 
        private String lang; 
        private String nodeId; 
        private String nodeName; 
        private Integer pageSize; 
        private String presetName; 

        private Builder() {
            super();
        } 

        private Builder(ListHoneypotPresetRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.honeypotImageName = request.honeypotImageName;
            this.lang = request.lang;
            this.nodeId = request.nodeId;
            this.nodeName = request.nodeName;
            this.pageSize = request.pageSize;
            this.presetName = request.presetName;
        } 

        /**
         * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
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
         * <p>The name of the honeypot image.</p>
         * 
         * <strong>example:</strong>
         * <p>ruoyi</p>
         */
        public Builder honeypotImageName(String honeypotImageName) {
            this.putQueryParameter("HoneypotImageName", honeypotImageName);
            this.honeypotImageName = honeypotImageName;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Valid values:</p>
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
         * <p>The ID of the management node.</p>
         * 
         * <strong>example:</strong>
         * <p>d892b4fe-af0d-4486-ab2a-8a518045****</p>
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
         * <p>Node1</p>
         */
        public Builder nodeName(String nodeName) {
            this.putQueryParameter("NodeName", nodeName);
            this.nodeName = nodeName;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
         * <blockquote>
         * <p>We recommend that you do not leave this parameter empty.</p>
         * </blockquote>
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
         * <p>The custom name of the honeypot template.</p>
         * 
         * <strong>example:</strong>
         * <p>mx-rouyi</p>
         */
        public Builder presetName(String presetName) {
            this.putQueryParameter("PresetName", presetName);
            this.presetName = presetName;
            return this;
        }

        @Override
        public ListHoneypotPresetRequest build() {
            return new ListHoneypotPresetRequest(this);
        } 

    } 

}
