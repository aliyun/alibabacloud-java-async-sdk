// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StreamUploadInfo} extends {@link TeaModel}
 *
 * <p>StreamUploadInfo</p>
 */
public class StreamUploadInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("location")
    private String location;

    @com.aliyun.core.annotation.NameInMap("part_info_list")
    private java.util.List < UploadPartInfo > partInfoList;

    @com.aliyun.core.annotation.NameInMap("pre_rapid_upload")
    private Boolean preRapidUpload;

    @com.aliyun.core.annotation.NameInMap("rapid_upload")
    private Boolean rapidUpload;

    @com.aliyun.core.annotation.NameInMap("upload_id")
    private String uploadId;

    private StreamUploadInfo(Builder builder) {
        this.location = builder.location;
        this.partInfoList = builder.partInfoList;
        this.preRapidUpload = builder.preRapidUpload;
        this.rapidUpload = builder.rapidUpload;
        this.uploadId = builder.uploadId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StreamUploadInfo create() {
        return builder().build();
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return partInfoList
     */
    public java.util.List < UploadPartInfo > getPartInfoList() {
        return this.partInfoList;
    }

    /**
     * @return preRapidUpload
     */
    public Boolean getPreRapidUpload() {
        return this.preRapidUpload;
    }

    /**
     * @return rapidUpload
     */
    public Boolean getRapidUpload() {
        return this.rapidUpload;
    }

    /**
     * @return uploadId
     */
    public String getUploadId() {
        return this.uploadId;
    }

    public static final class Builder {
        private String location; 
        private java.util.List < UploadPartInfo > partInfoList; 
        private Boolean preRapidUpload; 
        private Boolean rapidUpload; 
        private String uploadId; 

        /**
         * location.
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * part_info_list.
         */
        public Builder partInfoList(java.util.List < UploadPartInfo > partInfoList) {
            this.partInfoList = partInfoList;
            return this;
        }

        /**
         * pre_rapid_upload.
         */
        public Builder preRapidUpload(Boolean preRapidUpload) {
            this.preRapidUpload = preRapidUpload;
            return this;
        }

        /**
         * rapid_upload.
         */
        public Builder rapidUpload(Boolean rapidUpload) {
            this.rapidUpload = rapidUpload;
            return this;
        }

        /**
         * upload_id.
         */
        public Builder uploadId(String uploadId) {
            this.uploadId = uploadId;
            return this;
        }

        public StreamUploadInfo build() {
            return new StreamUploadInfo(this);
        } 

    } 

}
