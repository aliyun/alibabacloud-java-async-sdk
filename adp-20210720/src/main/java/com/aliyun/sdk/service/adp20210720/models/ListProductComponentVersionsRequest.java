// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProductComponentVersionsRequest} extends {@link RequestModel}
 *
 * <p>ListProductComponentVersionsRequest</p>
 */
public class ListProductComponentVersionsRequest extends Request {
    @Path
    @NameInMap("uid")
    private String uid;

    @Query
    @NameInMap("category")
    private String category;

    @Query
    @NameInMap("pageNum")
    private String pageNum;

    @Query
    @NameInMap("pageSize")
    @Validation(maxLength = 2)
    private String pageSize;

    @Query
    @NameInMap("releaseName")
    private String releaseName;

    @Query
    @NameInMap("sortDirect")
    private String sortDirect;

    @Query
    @NameInMap("sortKey")
    private String sortKey;

    private ListProductComponentVersionsRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.category = builder.category;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.releaseName = builder.releaseName;
        this.sortDirect = builder.sortDirect;
        this.sortKey = builder.sortKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductComponentVersionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return pageNum
     */
    public String getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return releaseName
     */
    public String getReleaseName() {
        return this.releaseName;
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

    public static final class Builder extends Request.Builder<ListProductComponentVersionsRequest, Builder> {
        private String uid; 
        private String category; 
        private String pageNum; 
        private String pageSize; 
        private String releaseName; 
        private String sortDirect; 
        private String sortKey; 

        private Builder() {
            super();
        } 

        private Builder(ListProductComponentVersionsRequest request) {
            super(request);
            this.uid = request.uid;
            this.category = request.category;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.releaseName = request.releaseName;
            this.sortDirect = request.sortDirect;
            this.sortKey = request.sortKey;
        } 

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putPathParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * category.
         */
        public Builder category(String category) {
            this.putQueryParameter("category", category);
            this.category = category;
            return this;
        }

        /**
         * pageNum.
         */
        public Builder pageNum(String pageNum) {
            this.putQueryParameter("pageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * releaseName.
         */
        public Builder releaseName(String releaseName) {
            this.putQueryParameter("releaseName", releaseName);
            this.releaseName = releaseName;
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

        @Override
        public ListProductComponentVersionsRequest build() {
            return new ListProductComponentVersionsRequest(this);
        } 

    } 

}
