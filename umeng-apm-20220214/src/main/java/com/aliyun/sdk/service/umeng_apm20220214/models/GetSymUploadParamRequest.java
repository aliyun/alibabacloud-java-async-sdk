// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_apm20220214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSymUploadParamRequest} extends {@link RequestModel}
 *
 * <p>GetSymUploadParamRequest</p>
 */
public class GetSymUploadParamRequest extends Request {
    @Query
    @NameInMap("appVersion")
    @Validation(required = true)
    private String appVersion;

    @Query
    @NameInMap("dataSourceId")
    @Validation(required = true)
    private String dataSourceId;

    @Query
    @NameInMap("fileName")
    @Validation(required = true)
    private String fileName;

    @Query
    @NameInMap("fileType")
    @Validation(required = true, maximum = 4, minimum = 1)
    private Integer fileType;

    @Query
    @NameInMap("flutterName")
    private String flutterName;

    private GetSymUploadParamRequest(Builder builder) {
        super(builder);
        this.appVersion = builder.appVersion;
        this.dataSourceId = builder.dataSourceId;
        this.fileName = builder.fileName;
        this.fileType = builder.fileType;
        this.flutterName = builder.flutterName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSymUploadParamRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appVersion
     */
    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return this.dataSourceId;
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
     * @return flutterName
     */
    public String getFlutterName() {
        return this.flutterName;
    }

    public static final class Builder extends Request.Builder<GetSymUploadParamRequest, Builder> {
        private String appVersion; 
        private String dataSourceId; 
        private String fileName; 
        private Integer fileType; 
        private String flutterName; 

        private Builder() {
            super();
        } 

        private Builder(GetSymUploadParamRequest request) {
            super(request);
            this.appVersion = request.appVersion;
            this.dataSourceId = request.dataSourceId;
            this.fileName = request.fileName;
            this.fileType = request.fileType;
            this.flutterName = request.flutterName;
        } 

        /**
         * appVersion.
         */
        public Builder appVersion(String appVersion) {
            this.putQueryParameter("appVersion", appVersion);
            this.appVersion = appVersion;
            return this;
        }

        /**
         * dataSourceId.
         */
        public Builder dataSourceId(String dataSourceId) {
            this.putQueryParameter("dataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * fileName.
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("fileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * fileType.
         */
        public Builder fileType(Integer fileType) {
            this.putQueryParameter("fileType", fileType);
            this.fileType = fileType;
            return this;
        }

        /**
         * flutterName.
         */
        public Builder flutterName(String flutterName) {
            this.putQueryParameter("flutterName", flutterName);
            this.flutterName = flutterName;
            return this;
        }

        @Override
        public GetSymUploadParamRequest build() {
            return new GetSymUploadParamRequest(this);
        } 

    } 

}
