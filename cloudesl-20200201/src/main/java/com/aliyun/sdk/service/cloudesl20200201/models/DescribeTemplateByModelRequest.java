// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTemplateByModelRequest} extends {@link RequestModel}
 *
 * <p>DescribeTemplateByModelRequest</p>
 */
public class DescribeTemplateByModelRequest extends Request {
    @Body
    @NameInMap("DeviceType")
    private String deviceType;

    @Body
    @NameInMap("EslSize")
    private String eslSize;

    @Body
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("TemplateVersion")
    private String templateVersion;

    private DescribeTemplateByModelRequest(Builder builder) {
        super(builder);
        this.deviceType = builder.deviceType;
        this.eslSize = builder.eslSize;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.templateVersion = builder.templateVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTemplateByModelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceType
     */
    public String getDeviceType() {
        return this.deviceType;
    }

    /**
     * @return eslSize
     */
    public String getEslSize() {
        return this.eslSize;
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
     * @return templateVersion
     */
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public static final class Builder extends Request.Builder<DescribeTemplateByModelRequest, Builder> {
        private String deviceType; 
        private String eslSize; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String templateVersion; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTemplateByModelRequest request) {
            super(request);
            this.deviceType = request.deviceType;
            this.eslSize = request.eslSize;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.templateVersion = request.templateVersion;
        } 

        /**
         * DeviceType.
         */
        public Builder deviceType(String deviceType) {
            this.putBodyParameter("DeviceType", deviceType);
            this.deviceType = deviceType;
            return this;
        }

        /**
         * EslSize.
         */
        public Builder eslSize(String eslSize) {
            this.putBodyParameter("EslSize", eslSize);
            this.eslSize = eslSize;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * TemplateVersion.
         */
        public Builder templateVersion(String templateVersion) {
            this.putBodyParameter("TemplateVersion", templateVersion);
            this.templateVersion = templateVersion;
            return this;
        }

        @Override
        public DescribeTemplateByModelRequest build() {
            return new DescribeTemplateByModelRequest(this);
        } 

    } 

}
