// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PersonalRightsInfoResponse} extends {@link TeaModel}
 *
 * <p>PersonalRightsInfoResponse</p>
 */
public class PersonalRightsInfoResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("expires_time")
    private String expiresTime;

    @com.aliyun.core.annotation.NameInMap("history_latest_rights")
    private PersonalRightsInfoResponse historyLatestRights;

    @com.aliyun.core.annotation.NameInMap("icon")
    private String icon;

    @com.aliyun.core.annotation.NameInMap("is_expires")
    private Boolean isExpires;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("other_rights")
    private PersonalRightsInfoResponse otherRights;

    @com.aliyun.core.annotation.NameInMap("privileges")
    private java.util.List<DataBoxPrivileges> privileges;

    @com.aliyun.core.annotation.NameInMap("spu_id")
    private String spuId;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    private PersonalRightsInfoResponse(BuilderImpl builder) {
        super(builder);
        this.expiresTime = builder.expiresTime;
        this.historyLatestRights = builder.historyLatestRights;
        this.icon = builder.icon;
        this.isExpires = builder.isExpires;
        this.name = builder.name;
        this.otherRights = builder.otherRights;
        this.privileges = builder.privileges;
        this.spuId = builder.spuId;
        this.title = builder.title;
    }

    public static PersonalRightsInfoResponse create() {
        return new BuilderImpl().build();
    }

@Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return expiresTime
     */
    public String getExpiresTime() {
        return this.expiresTime;
    }

    /**
     * @return historyLatestRights
     */
    public PersonalRightsInfoResponse getHistoryLatestRights() {
        return this.historyLatestRights;
    }

    /**
     * @return icon
     */
    public String getIcon() {
        return this.icon;
    }

    /**
     * @return isExpires
     */
    public Boolean getIsExpires() {
        return this.isExpires;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return otherRights
     */
    public PersonalRightsInfoResponse getOtherRights() {
        return this.otherRights;
    }

    /**
     * @return privileges
     */
    public java.util.List<DataBoxPrivileges> getPrivileges() {
        return this.privileges;
    }

    /**
     * @return spuId
     */
    public String getSpuId() {
        return this.spuId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public interface Builder extends Response.Builder<PersonalRightsInfoResponse, Builder> {

        Builder expiresTime(String expiresTime);

        Builder historyLatestRights(PersonalRightsInfoResponse historyLatestRights);

        Builder icon(String icon);

        Builder isExpires(Boolean isExpires);

        Builder name(String name);

        Builder otherRights(PersonalRightsInfoResponse otherRights);

        Builder privileges(java.util.List<DataBoxPrivileges> privileges);

        Builder spuId(String spuId);

        Builder title(String title);

        @Override
        PersonalRightsInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PersonalRightsInfoResponse, Builder>
            implements Builder {
        private String expiresTime; 
        private PersonalRightsInfoResponse historyLatestRights; 
        private String icon; 
        private Boolean isExpires; 
        private String name; 
        private PersonalRightsInfoResponse otherRights; 
        private java.util.List<DataBoxPrivileges> privileges; 
        private String spuId; 
        private String title; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PersonalRightsInfoResponse response) {
            super(response);
            this.expiresTime = response.expiresTime;
            this.historyLatestRights = response.historyLatestRights;
            this.icon = response.icon;
            this.isExpires = response.isExpires;
            this.name = response.name;
            this.otherRights = response.otherRights;
            this.privileges = response.privileges;
            this.spuId = response.spuId;
            this.title = response.title;
        } 

        /**
         * expires_time.
         */
        @Override
        public Builder expiresTime(String expiresTime) {
            this.expiresTime = expiresTime;
            return this;
        }

        /**
         * history_latest_rights.
         */
        @Override
        public Builder historyLatestRights(PersonalRightsInfoResponse historyLatestRights) {
            this.historyLatestRights = historyLatestRights;
            return this;
        }

        /**
         * icon.
         */
        @Override
        public Builder icon(String icon) {
            this.icon = icon;
            return this;
        }

        /**
         * is_expires.
         */
        @Override
        public Builder isExpires(Boolean isExpires) {
            this.isExpires = isExpires;
            return this;
        }

        /**
         * name.
         */
        @Override
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * other_rights.
         */
        @Override
        public Builder otherRights(PersonalRightsInfoResponse otherRights) {
            this.otherRights = otherRights;
            return this;
        }

        /**
         * privileges.
         */
        @Override
        public Builder privileges(java.util.List<DataBoxPrivileges> privileges) {
            this.privileges = privileges;
            return this;
        }

        /**
         * spu_id.
         */
        @Override
        public Builder spuId(String spuId) {
            this.spuId = spuId;
            return this;
        }

        /**
         * title.
         */
        @Override
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        @Override
        public PersonalRightsInfoResponse build() {
            return new PersonalRightsInfoResponse(this);
        } 

    } 

}
