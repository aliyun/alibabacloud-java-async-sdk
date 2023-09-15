// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDomainToDomainGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateDomainToDomainGroupRequest</p>
 */
public class UpdateDomainToDomainGroupRequest extends Request {
    @Query
    @NameInMap("DataSource")
    @Validation(required = true)
    private Integer dataSource;

    @Query
    @NameInMap("DomainGroupId")
    @Validation(required = true)
    private Long domainGroupId;

    @Query
    @NameInMap("DomainName")
    private java.util.List < String > domainName;

    @Body
    @NameInMap("FileToUpload")
    private String fileToUpload;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Replace")
    @Validation(required = true)
    private Boolean replace;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

    private UpdateDomainToDomainGroupRequest(Builder builder) {
        super(builder);
        this.dataSource = builder.dataSource;
        this.domainGroupId = builder.domainGroupId;
        this.domainName = builder.domainName;
        this.fileToUpload = builder.fileToUpload;
        this.lang = builder.lang;
        this.replace = builder.replace;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDomainToDomainGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataSource
     */
    public Integer getDataSource() {
        return this.dataSource;
    }

    /**
     * @return domainGroupId
     */
    public Long getDomainGroupId() {
        return this.domainGroupId;
    }

    /**
     * @return domainName
     */
    public java.util.List < String > getDomainName() {
        return this.domainName;
    }

    /**
     * @return fileToUpload
     */
    public String getFileToUpload() {
        return this.fileToUpload;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return replace
     */
    public Boolean getReplace() {
        return this.replace;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<UpdateDomainToDomainGroupRequest, Builder> {
        private Integer dataSource; 
        private Long domainGroupId; 
        private java.util.List < String > domainName; 
        private String fileToUpload; 
        private String lang; 
        private Boolean replace; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDomainToDomainGroupRequest request) {
            super(request);
            this.dataSource = request.dataSource;
            this.domainGroupId = request.domainGroupId;
            this.domainName = request.domainName;
            this.fileToUpload = request.fileToUpload;
            this.lang = request.lang;
            this.replace = request.replace;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * DataSource.
         */
        public Builder dataSource(Integer dataSource) {
            this.putQueryParameter("DataSource", dataSource);
            this.dataSource = dataSource;
            return this;
        }

        /**
         * DomainGroupId.
         */
        public Builder domainGroupId(Long domainGroupId) {
            this.putQueryParameter("DomainGroupId", domainGroupId);
            this.domainGroupId = domainGroupId;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(java.util.List < String > domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * FileToUpload.
         */
        public Builder fileToUpload(String fileToUpload) {
            this.putBodyParameter("FileToUpload", fileToUpload);
            this.fileToUpload = fileToUpload;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * Replace.
         */
        public Builder replace(Boolean replace) {
            this.putQueryParameter("Replace", replace);
            this.replace = replace;
            return this;
        }

        /**
         * UserClientIp.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public UpdateDomainToDomainGroupRequest build() {
            return new UpdateDomainToDomainGroupRequest(this);
        } 

    } 

}
