// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportSwaggerRequest} extends {@link RequestModel}
 *
 * <p>ImportSwaggerRequest</p>
 */
public class ImportSwaggerRequest extends Request {
    @Body
    @NameInMap("Data")
    private String data;

    @Query
    @NameInMap("DataFormat")
    private String dataFormat;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("Overwrite")
    private Boolean overwrite;

    private ImportSwaggerRequest(Builder builder) {
        super(builder);
        this.data = builder.data;
        this.dataFormat = builder.dataFormat;
        this.dryRun = builder.dryRun;
        this.groupId = builder.groupId;
        this.overwrite = builder.overwrite;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportSwaggerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return dataFormat
     */
    public String getDataFormat() {
        return this.dataFormat;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return overwrite
     */
    public Boolean getOverwrite() {
        return this.overwrite;
    }

    public static final class Builder extends Request.Builder<ImportSwaggerRequest, Builder> {
        private String data; 
        private String dataFormat; 
        private Boolean dryRun; 
        private String groupId; 
        private Boolean overwrite; 

        private Builder() {
            super();
        } 

        private Builder(ImportSwaggerRequest request) {
            super(request);
            this.data = request.data;
            this.dataFormat = request.dataFormat;
            this.dryRun = request.dryRun;
            this.groupId = request.groupId;
            this.overwrite = request.overwrite;
        } 

        /**
         * Data.
         */
        public Builder data(String data) {
            this.putBodyParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * DataFormat.
         */
        public Builder dataFormat(String dataFormat) {
            this.putQueryParameter("DataFormat", dataFormat);
            this.dataFormat = dataFormat;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * Overwrite.
         */
        public Builder overwrite(Boolean overwrite) {
            this.putQueryParameter("Overwrite", overwrite);
            this.overwrite = overwrite;
            return this;
        }

        @Override
        public ImportSwaggerRequest build() {
            return new ImportSwaggerRequest(this);
        } 

    } 

}
