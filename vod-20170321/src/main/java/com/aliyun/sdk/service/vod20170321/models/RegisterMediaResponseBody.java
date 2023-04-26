// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterMediaResponseBody} extends {@link TeaModel}
 *
 * <p>RegisterMediaResponseBody</p>
 */
public class RegisterMediaResponseBody extends TeaModel {
    @NameInMap("FailedFileURLs")
    private java.util.List < String > failedFileURLs;

    @NameInMap("RegisteredMediaList")
    private java.util.List < RegisteredMediaList> registeredMediaList;

    @NameInMap("RequestId")
    private String requestId;

    private RegisterMediaResponseBody(Builder builder) {
        this.failedFileURLs = builder.failedFileURLs;
        this.registeredMediaList = builder.registeredMediaList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterMediaResponseBody create() {
        return builder().build();
    }

    /**
     * @return failedFileURLs
     */
    public java.util.List < String > getFailedFileURLs() {
        return this.failedFileURLs;
    }

    /**
     * @return registeredMediaList
     */
    public java.util.List < RegisteredMediaList> getRegisteredMediaList() {
        return this.registeredMediaList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > failedFileURLs; 
        private java.util.List < RegisteredMediaList> registeredMediaList; 
        private String requestId; 

        /**
         * ## RegisterMetadata
         * <p>
         * 
         * The following table describes the metadata of the media file that you want to register. 
         * 
         * | Parameter | Type | Required | Description |
         * | --------- | ---- | -------- | ----------- |
         * | FileURL | String | Yes | The OSS URL of the source file. You can call the [GetMezzanineInfo](~~GetMezzanineInfo~~) operation to obtain the OSS URL of the source file.  <br>The URL can be up to 1,024 bytes in length. The file name must be globally unique. If the media file that you want to register is registered before, the unique media ID that is associated with the media file is returned. |
         * | Title | String | Yes | The title of the media file. The title can be up to 128 bytes in length. The value must be encoded in UTF-8. |
         * | Description | String | No | The description of the media file. The description can be up to 1,024 bytes in length. The value must be encoded in UTF-8. |
         * | Tags | String | No | The one or more tags of the media file. Each tag can be up to 32 bytes in length. You can specify a maximum of 16 tags. Separate multiple tags with commas (,). The value must be encoded in UTF-8. |
         * | CoverURL | String | No | The URL of the thumbnail. The URL can be up to 1,024 bytes in length. |
         * | CateId | Long | No | The category ID of the media file. You can use one of the following methods to obtain the category ID: <br>Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com/). In the left-side navigation pane, choose **Configuration Management** > **Media Management** > **Categories**. On the Categories page, you can view the category ID of the media file.  <br>View the value of the CateId parameter returned by the [AddCategory](~~AddCategory~~) operation that you called to create a category.  <br>View the value of the CateId parameter returned by the [GetCategories](~~GetCategories~~) operation that you called to query a category. |
         */
        public Builder failedFileURLs(java.util.List < String > failedFileURLs) {
            this.failedFileURLs = failedFileURLs;
            return this;
        }

        /**
         * RegisteredMediaList.
         */
        public Builder registeredMediaList(java.util.List < RegisteredMediaList> registeredMediaList) {
            this.registeredMediaList = registeredMediaList;
            return this;
        }

        /**
         * The OSS URL of the media file.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RegisterMediaResponseBody build() {
            return new RegisterMediaResponseBody(this);
        } 

    } 

    public static class RegisteredMediaList extends TeaModel {
        @NameInMap("FileURL")
        private String fileURL;

        @NameInMap("MediaId")
        private String mediaId;

        @NameInMap("NewRegister")
        private Boolean newRegister;

        private RegisteredMediaList(Builder builder) {
            this.fileURL = builder.fileURL;
            this.mediaId = builder.mediaId;
            this.newRegister = builder.newRegister;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegisteredMediaList create() {
            return builder().build();
        }

        /**
         * @return fileURL
         */
        public String getFileURL() {
            return this.fileURL;
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        /**
         * @return newRegister
         */
        public Boolean getNewRegister() {
            return this.newRegister;
        }

        public static final class Builder {
            private String fileURL; 
            private String mediaId; 
            private Boolean newRegister; 

            /**
             * FileURL.
             */
            public Builder fileURL(String fileURL) {
                this.fileURL = fileURL;
                return this;
            }

            /**
             * MediaId.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * NewRegister.
             */
            public Builder newRegister(Boolean newRegister) {
                this.newRegister = newRegister;
                return this;
            }

            public RegisteredMediaList build() {
                return new RegisteredMediaList(this);
            } 

        } 

    }
}
