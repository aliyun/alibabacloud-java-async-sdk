// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The end of the time range during which the custom lines are created to query. Set the time to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1672136518234</p>
         */
        public Builder createTimestampEnd(Long createTimestampEnd) {
            this.putQueryParameter("CreateTimestampEnd", createTimestampEnd);
            this.createTimestampEnd = createTimestampEnd;
            return this;
        }

        /**
         * <p>The beginning of the time range during which the custom lines are created to query. Set the time to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1672136518123</p>
         */
        public Builder createTimestampStart(Long createTimestampStart) {
            this.putQueryParameter("CreateTimestampStart", createTimestampStart);
            this.createTimestampStart = createTimestampStart;
            return this;
        }

        /**
         * <p>The IDs of the creators for the custom lines.</p>
         */
        public Builder creator(java.util.List < String > creator) {
            this.putQueryParameter("Creator", creator);
            this.creator = creator;
            return this;
        }

        /**
         * <p>The IPv4 address.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        public Builder ipv4(String ipv4) {
            this.putQueryParameter("Ipv4", ipv4);
            this.ipv4 = ipv4;
            return this;
        }

        /**
         * <p>The language.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The name of the custom line.</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The page number. Pages start from page <strong>1</strong>. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: <strong>1 to 100</strong>. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The end of the time range during which the custom lines are updated to query. Set the time to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1672136518000</p>
         */
        public Builder updateTimestampEnd(Long updateTimestampEnd) {
            this.putQueryParameter("UpdateTimestampEnd", updateTimestampEnd);
            this.updateTimestampEnd = updateTimestampEnd;
            return this;
        }

        /**
         * <p>The beginning of the time range during which the custom lines are updated to query. Set the time to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1672136515000</p>
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
