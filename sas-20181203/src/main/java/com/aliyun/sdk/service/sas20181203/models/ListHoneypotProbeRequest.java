// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHoneypotProbeRequest} extends {@link RequestModel}
 *
 * <p>ListHoneypotProbeRequest</p>
 */
public class ListHoneypotProbeRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("DisplayName")
    private String displayName;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ProbeStatus")
    private String probeStatus;

    @Query
    @NameInMap("ProbeType")
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
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * 探针名称
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProbeStatus.
         */
        public Builder probeStatus(String probeStatus) {
            this.putQueryParameter("ProbeStatus", probeStatus);
            this.probeStatus = probeStatus;
            return this;
        }

        /**
         * ProbeType.
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
