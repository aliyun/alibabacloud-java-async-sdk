// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qianzhou20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListClusterImagesRequest} extends {@link RequestModel}
 *
 * <p>ListClusterImagesRequest</p>
 */
public class ListClusterImagesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("cluster_id")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("image_hash")
    private String imageHash;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("image_name")
    private String imageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page_no")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page_size")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("uid")
    private String uid;

    private ListClusterImagesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.imageHash = builder.imageHash;
        this.imageName = builder.imageName;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterImagesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return imageHash
     */
    public String getImageHash() {
        return this.imageHash;
    }

    /**
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<ListClusterImagesRequest, Builder> {
        private String clusterId; 
        private String imageHash; 
        private String imageName; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(ListClusterImagesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.imageHash = request.imageHash;
            this.imageName = request.imageName;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.uid = request.uid;
        } 

        /**
         * cluster_id.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * image_hash.
         */
        public Builder imageHash(String imageHash) {
            this.putQueryParameter("image_hash", imageHash);
            this.imageHash = imageHash;
            return this;
        }

        /**
         * image_name.
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("image_name", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * page_no.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("page_no", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * page_size.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("page_size", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putQueryParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public ListClusterImagesRequest build() {
            return new ListClusterImagesRequest(this);
        } 

    } 

}
