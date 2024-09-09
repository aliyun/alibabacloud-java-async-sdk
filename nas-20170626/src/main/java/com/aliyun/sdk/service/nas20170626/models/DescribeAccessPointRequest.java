// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccessPointRequest} extends {@link RequestModel}
 *
 * <p>DescribeAccessPointRequest</p>
 */
public class DescribeAccessPointRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessPointId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessPointId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    private DescribeAccessPointRequest(Builder builder) {
        super(builder);
        this.accessPointId = builder.accessPointId;
        this.fileSystemId = builder.fileSystemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccessPointRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessPointId
     */
    public String getAccessPointId() {
        return this.accessPointId;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public static final class Builder extends Request.Builder<DescribeAccessPointRequest, Builder> {
        private String accessPointId; 
        private String fileSystemId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAccessPointRequest request) {
            super(request);
            this.accessPointId = request.accessPointId;
            this.fileSystemId = request.fileSystemId;
        } 

        /**
         * The ID of the access point.
         */
        public Builder accessPointId(String accessPointId) {
            this.putQueryParameter("AccessPointId", accessPointId);
            this.accessPointId = accessPointId;
            return this;
        }

        /**
         * The ID of the file system.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        @Override
        public DescribeAccessPointRequest build() {
            return new DescribeAccessPointRequest(this);
        } 

    } 

}
