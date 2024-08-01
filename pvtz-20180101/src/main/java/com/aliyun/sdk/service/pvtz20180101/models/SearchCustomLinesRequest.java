// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchCustomLinesRequest} extends {@link RequestModel}
 *
 * <p>SearchCustomLinesRequest</p>
 */
public class SearchCustomLinesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateTimestampEnd")
    private Long createTimestampEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateTimestampStart")
    private Long createTimestampStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Creator")
    private java.util.List < String > creator;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv4")
    private String ipv4;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(maximum = 9999999, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpdateTimestampEnd")
    private Long updateTimestampEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpdateTimestampStart")
    private Long updateTimestampStart;

    private SearchCustomLinesRequest(Builder builder) {
        super(builder);
        this.createTimestampEnd = builder.createTimestampEnd;
        this.createTimestampStart = builder.createTimestampStart;
        this.creator = builder.creator;
        this.ipv4 = builder.ipv4;
        this.lang = builder.lang;
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.updateTimestampEnd = builder.updateTimestampEnd;
        this.updateTimestampStart = builder.updateTimestampStart;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchCustomLinesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTimestampEnd
     */
    public Long getCreateTimestampEnd() {
        return this.createTimestampEnd;
    }

    /**
     * @return createTimestampStart
     */
    public Long getCreateTimestampStart() {
        return this.createTimestampStart;
    }

    /**
     * @return creator
     */
    public java.util.List < String > getCreator() {
        return this.creator;
    }

    /**
     * @return ipv4
     */
    public String getIpv4() {
        return this.ipv4;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return updateTimestampEnd
     */
    public Long getUpdateTimestampEnd() {
        return this.updateTimestampEnd;
    }

    /**
     * @return updateTimestampStart
     */
    public Long getUpdateTimestampStart() {
        return this.updateTimestampStart;
    }

    public static final class Builder extends Request.Builder<SearchCustomLinesRequest, Builder> {
        private Long createTimestampEnd; 
        private Long createTimestampStart; 
        private java.util.List < String > creator; 
        private String ipv4; 
        private String lang; 
        private String name; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long updateTimestampEnd; 
        private Long updateTimestampStart; 

        private Builder() {
            super();
        } 

        private Builder(SearchCustomLinesRequest request) {
            super(request);
            this.createTimestampEnd = request.createTimestampEnd;
            this.createTimestampStart = request.createTimestampStart;
            this.creator = request.creator;
            this.ipv4 = request.ipv4;
            this.lang = request.lang;
            this.name = request.name;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.updateTimestampEnd = request.updateTimestampEnd;
            this.updateTimestampStart = request.updateTimestampStart;
        } 

        /**
         * CreateTimestampEnd.
         */
        public Builder createTimestampEnd(Long createTimestampEnd) {
            this.putQueryParameter("CreateTimestampEnd", createTimestampEnd);
            this.createTimestampEnd = createTimestampEnd;
            return this;
        }

        /**
         * CreateTimestampStart.
         */
        public Builder createTimestampStart(Long createTimestampStart) {
            this.putQueryParameter("CreateTimestampStart", createTimestampStart);
            this.createTimestampStart = createTimestampStart;
            return this;
        }

        /**
         * Creator.
         */
        public Builder creator(java.util.List < String > creator) {
            this.putQueryParameter("Creator", creator);
            this.creator = creator;
            return this;
        }

        /**
         * Ipv4.
         */
        public Builder ipv4(String ipv4) {
            this.putQueryParameter("Ipv4", ipv4);
            this.ipv4 = ipv4;
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
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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
         * UpdateTimestampEnd.
         */
        public Builder updateTimestampEnd(Long updateTimestampEnd) {
            this.putQueryParameter("UpdateTimestampEnd", updateTimestampEnd);
            this.updateTimestampEnd = updateTimestampEnd;
            return this;
        }

        /**
         * UpdateTimestampStart.
         */
        public Builder updateTimestampStart(Long updateTimestampStart) {
            this.putQueryParameter("UpdateTimestampStart", updateTimestampStart);
            this.updateTimestampStart = updateTimestampStart;
            return this;
        }

        @Override
        public SearchCustomLinesRequest build() {
            return new SearchCustomLinesRequest(this);
        } 

    } 

}
