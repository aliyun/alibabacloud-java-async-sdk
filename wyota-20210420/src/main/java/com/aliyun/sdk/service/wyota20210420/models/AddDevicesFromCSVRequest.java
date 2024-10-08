// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddDevicesFromCSVRequest} extends {@link RequestModel}
 *
 * <p>AddDevicesFromCSVRequest</p>
 */
public class AddDevicesFromCSVRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileName")
    private String fileName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileType")
    private Integer fileType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SeatCol")
    private Integer seatCol;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SiteId")
    private String siteId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SiteName")
    private String siteName;

    private AddDevicesFromCSVRequest(Builder builder) {
        super(builder);
        this.fileName = builder.fileName;
        this.fileType = builder.fileType;
        this.seatCol = builder.seatCol;
        this.siteId = builder.siteId;
        this.siteName = builder.siteName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDevicesFromCSVRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return fileType
     */
    public Integer getFileType() {
        return this.fileType;
    }

    /**
     * @return seatCol
     */
    public Integer getSeatCol() {
        return this.seatCol;
    }

    /**
     * @return siteId
     */
    public String getSiteId() {
        return this.siteId;
    }

    /**
     * @return siteName
     */
    public String getSiteName() {
        return this.siteName;
    }

    public static final class Builder extends Request.Builder<AddDevicesFromCSVRequest, Builder> {
        private String fileName; 
        private Integer fileType; 
        private Integer seatCol; 
        private String siteId; 
        private String siteName; 

        private Builder() {
            super();
        } 

        private Builder(AddDevicesFromCSVRequest request) {
            super(request);
            this.fileName = request.fileName;
            this.fileType = request.fileType;
            this.seatCol = request.seatCol;
            this.siteId = request.siteId;
            this.siteName = request.siteName;
        } 

        /**
         * FileName.
         */
        public Builder fileName(String fileName) {
            this.putBodyParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * FileType.
         */
        public Builder fileType(Integer fileType) {
            this.putBodyParameter("FileType", fileType);
            this.fileType = fileType;
            return this;
        }

        /**
         * SeatCol.
         */
        public Builder seatCol(Integer seatCol) {
            this.putBodyParameter("SeatCol", seatCol);
            this.seatCol = seatCol;
            return this;
        }

        /**
         * SiteId.
         */
        public Builder siteId(String siteId) {
            this.putBodyParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * SiteName.
         */
        public Builder siteName(String siteName) {
            this.putBodyParameter("SiteName", siteName);
            this.siteName = siteName;
            return this;
        }

        @Override
        public AddDevicesFromCSVRequest build() {
            return new AddDevicesFromCSVRequest(this);
        } 

    } 

}
