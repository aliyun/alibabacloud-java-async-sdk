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
 * {@link ListHoneypotProbeRequest} extends {@link RequestModel}
 *
 * <p>ListHoneypotProbeRequest</p>
 */
public class ListHoneypotProbeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProbeStatus")
    private String probeStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProbeType")
    private String probeType;

    private ListHoneypotProbeRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.displayName = builder.displayName;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.probeStatus = builder.probeStatus;
        this.probeType = builder.probeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHoneypotProbeRequest create() {
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
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
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
     * @return probeStatus
     */
    public String getProbeStatus() {
        return this.probeStatus;
    }

    /**
     * @return probeType
     */
    public String getProbeType() {
        return this.probeType;
    }

    public static final class Builder extends Request.Builder<ListHoneypotProbeRequest, Builder> {
        private Integer currentPage; 
        private String displayName; 
        private String lang; 
        private Integer pageSize; 
        private String probeStatus; 
        private String probeType; 

        private Builder() {
            super();
        } 

        private Builder(ListHoneypotProbeRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.displayName = request.displayName;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.probeStatus = request.probeStatus;
            this.probeType = request.probeType;
        } 

        /**
         * <p>The number of the page to return. Pages start from page <strong>1</strong>. Default value: <strong>1</strong>.</p>
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
         * <p>The name of the probe.</p>
         * 
         * <strong>example:</strong>
         * <p>probe-test</p>
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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
         * <p>The status of the probe. Valid values:</p>
         * <ul>
         * <li><strong>installed</strong>: installed</li>
         * <li><strong>install_failed</strong>: installation failed</li>
         * <li><strong>online</strong>: online</li>
         * <li><strong>offline</strong>: offline</li>
         * <li><strong>unnormal</strong>: abnormal</li>
         * <li><strong>unprobe</strong>: unauthorized</li>
         * <li><strong>uninstalling</strong>: being uninstalled</li>
         * <li><strong>uninstalled</strong>: uninstalled</li>
         * <li><strong>uninstall_failed</strong>: uninstallation failed</li>
         * <li><strong>not_exist</strong>: not installed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        public Builder probeStatus(String probeStatus) {
            this.putQueryParameter("ProbeStatus", probeStatus);
            this.probeStatus = probeStatus;
            return this;
        }

        /**
         * <p>The type of the probe. Valid values:</p>
         * <ul>
         * <li><strong>host_probe</strong>: host probe</li>
         * <li><strong>vpc_black_hole_probe</strong>: VPC probe</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>host_probe</p>
         */
        public Builder probeType(String probeType) {
            this.putQueryParameter("ProbeType", probeType);
            this.probeType = probeType;
            return this;
        }

        @Override
        public ListHoneypotProbeRequest build() {
            return new ListHoneypotProbeRequest(this);
        } 

    } 

}
