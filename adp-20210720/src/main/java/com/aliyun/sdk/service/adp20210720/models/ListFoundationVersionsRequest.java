// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFoundationVersionsRequest} extends {@link RequestModel}
 *
 * <p>ListFoundationVersionsRequest</p>
 */
public class ListFoundationVersionsRequest extends Request {
    @Query
    @NameInMap("onlyDefault")
    private Boolean onlyDefault;

    @Query
    @NameInMap("pageNum")
    private Integer pageNum;

    @Query
    @NameInMap("pageSize")
    private Integer pageSize;

    @Query
    @NameInMap("sortDirect")
    private String sortDirect;

    @Query
    @NameInMap("sortKey")
    private String sortKey;

    @Query
    @NameInMap("type")
    private String type;

    @Query
    @NameInMap("version")
    private String version;

    private ListFoundationVersionsRequest(Builder builder) {
        super(builder);
        this.onlyDefault = builder.onlyDefault;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.sortDirect = builder.sortDirect;
        this.sortKey = builder.sortKey;
        this.type = builder.type;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFoundationVersionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return onlyDefault
     */
    public Boolean getOnlyDefault() {
        return this.onlyDefault;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sortDirect
     */
    public String getSortDirect() {
        return this.sortDirect;
    }

    /**
     * @return sortKey
     */
    public String getSortKey() {
        return this.sortKey;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<ListFoundationVersionsRequest, Builder> {
        private Boolean onlyDefault; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String sortDirect; 
        private String sortKey; 
        private String type; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(ListFoundationVersionsRequest request) {
            super(request);
            this.onlyDefault = request.onlyDefault;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.sortDirect = request.sortDirect;
            this.sortKey = request.sortKey;
            this.type = request.type;
            this.version = request.version;
        } 

        /**
         * onlyDefault.
         */
        public Builder onlyDefault(Boolean onlyDefault) {
            this.putQueryParameter("onlyDefault", onlyDefault);
            this.onlyDefault = onlyDefault;
            return this;
        }

        /**
         * pageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("pageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * sortDirect.
         */
        public Builder sortDirect(String sortDirect) {
            this.putQueryParameter("sortDirect", sortDirect);
            this.sortDirect = sortDirect;
            return this;
        }

        /**
         * sortKey.
         */
        public Builder sortKey(String sortKey) {
            this.putQueryParameter("sortKey", sortKey);
            this.sortKey = sortKey;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * version.
         */
        public Builder version(String version) {
            this.putQueryParameter("version", version);
            this.version = version;
            return this;
        }

        @Override
        public ListFoundationVersionsRequest build() {
            return new ListFoundationVersionsRequest(this);
        } 

    } 

}
