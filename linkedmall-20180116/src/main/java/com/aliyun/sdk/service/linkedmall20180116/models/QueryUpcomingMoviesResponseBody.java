// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryUpcomingMoviesResponseBody} extends {@link TeaModel}
 *
 * <p>QueryUpcomingMoviesResponseBody</p>
 */
public class QueryUpcomingMoviesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("LogsId")
    private String logsId;

    @NameInMap("Message")
    private String message;

    @NameInMap("Movies")
    private Movies movies;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SubCode")
    private String subCode;

    @NameInMap("SubMessage")
    private String subMessage;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Long totalCount;

    private QueryUpcomingMoviesResponseBody(Builder builder) {
        this.code = builder.code;
        this.logsId = builder.logsId;
        this.message = builder.message;
        this.movies = builder.movies;
        this.requestId = builder.requestId;
        this.subCode = builder.subCode;
        this.subMessage = builder.subMessage;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUpcomingMoviesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return logsId
     */
    public String getLogsId() {
        return this.logsId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return movies
     */
    public Movies getMovies() {
        return this.movies;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subCode
     */
    public String getSubCode() {
        return this.subCode;
    }

    /**
     * @return subMessage
     */
    public String getSubMessage() {
        return this.subMessage;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private String logsId; 
        private String message; 
        private Movies movies; 
        private String requestId; 
        private String subCode; 
        private String subMessage; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * LogsId.
         */
        public Builder logsId(String logsId) {
            this.logsId = logsId;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Movies.
         */
        public Builder movies(Movies movies) {
            this.movies = movies;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SubCode.
         */
        public Builder subCode(String subCode) {
            this.subCode = subCode;
            return this;
        }

        /**
         * SubMessage.
         */
        public Builder subMessage(String subMessage) {
            this.subMessage = subMessage;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QueryUpcomingMoviesResponseBody build() {
            return new QueryUpcomingMoviesResponseBody(this);
        } 

    } 

    public static class Movie extends TeaModel {
        @NameInMap("BackgroundPicture")
        private String backgroundPicture;

        @NameInMap("Country")
        private String country;

        @NameInMap("Description")
        private String description;

        @NameInMap("Director")
        private String director;

        @NameInMap("Duration")
        private Long duration;

        @NameInMap("Highlight")
        private String highlight;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Language")
        private String language;

        @NameInMap("LeadingRole")
        private String leadingRole;

        @NameInMap("MovieName")
        private String movieName;

        @NameInMap("MovieNameEn")
        private String movieNameEn;

        @NameInMap("MovieTypeList")
        private String movieTypeList;

        @NameInMap("MovieVersion")
        private String movieVersion;

        @NameInMap("OpenDay")
        private String openDay;

        @NameInMap("OpenTime")
        private String openTime;

        @NameInMap("Poster")
        private String poster;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("TrailerList")
        private String trailerList;

        @NameInMap("Type")
        private String type;

        private Movie(Builder builder) {
            this.backgroundPicture = builder.backgroundPicture;
            this.country = builder.country;
            this.description = builder.description;
            this.director = builder.director;
            this.duration = builder.duration;
            this.highlight = builder.highlight;
            this.id = builder.id;
            this.language = builder.language;
            this.leadingRole = builder.leadingRole;
            this.movieName = builder.movieName;
            this.movieNameEn = builder.movieNameEn;
            this.movieTypeList = builder.movieTypeList;
            this.movieVersion = builder.movieVersion;
            this.openDay = builder.openDay;
            this.openTime = builder.openTime;
            this.poster = builder.poster;
            this.remark = builder.remark;
            this.trailerList = builder.trailerList;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Movie create() {
            return builder().build();
        }

        /**
         * @return backgroundPicture
         */
        public String getBackgroundPicture() {
            return this.backgroundPicture;
        }

        /**
         * @return country
         */
        public String getCountry() {
            return this.country;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return director
         */
        public String getDirector() {
            return this.director;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return highlight
         */
        public String getHighlight() {
            return this.highlight;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return leadingRole
         */
        public String getLeadingRole() {
            return this.leadingRole;
        }

        /**
         * @return movieName
         */
        public String getMovieName() {
            return this.movieName;
        }

        /**
         * @return movieNameEn
         */
        public String getMovieNameEn() {
            return this.movieNameEn;
        }

        /**
         * @return movieTypeList
         */
        public String getMovieTypeList() {
            return this.movieTypeList;
        }

        /**
         * @return movieVersion
         */
        public String getMovieVersion() {
            return this.movieVersion;
        }

        /**
         * @return openDay
         */
        public String getOpenDay() {
            return this.openDay;
        }

        /**
         * @return openTime
         */
        public String getOpenTime() {
            return this.openTime;
        }

        /**
         * @return poster
         */
        public String getPoster() {
            return this.poster;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return trailerList
         */
        public String getTrailerList() {
            return this.trailerList;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String backgroundPicture; 
            private String country; 
            private String description; 
            private String director; 
            private Long duration; 
            private String highlight; 
            private Long id; 
            private String language; 
            private String leadingRole; 
            private String movieName; 
            private String movieNameEn; 
            private String movieTypeList; 
            private String movieVersion; 
            private String openDay; 
            private String openTime; 
            private String poster; 
            private String remark; 
            private String trailerList; 
            private String type; 

            /**
             * BackgroundPicture.
             */
            public Builder backgroundPicture(String backgroundPicture) {
                this.backgroundPicture = backgroundPicture;
                return this;
            }

            /**
             * Country.
             */
            public Builder country(String country) {
                this.country = country;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Director.
             */
            public Builder director(String director) {
                this.director = director;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * Highlight.
             */
            public Builder highlight(String highlight) {
                this.highlight = highlight;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * LeadingRole.
             */
            public Builder leadingRole(String leadingRole) {
                this.leadingRole = leadingRole;
                return this;
            }

            /**
             * MovieName.
             */
            public Builder movieName(String movieName) {
                this.movieName = movieName;
                return this;
            }

            /**
             * MovieNameEn.
             */
            public Builder movieNameEn(String movieNameEn) {
                this.movieNameEn = movieNameEn;
                return this;
            }

            /**
             * MovieTypeList.
             */
            public Builder movieTypeList(String movieTypeList) {
                this.movieTypeList = movieTypeList;
                return this;
            }

            /**
             * MovieVersion.
             */
            public Builder movieVersion(String movieVersion) {
                this.movieVersion = movieVersion;
                return this;
            }

            /**
             * OpenDay.
             */
            public Builder openDay(String openDay) {
                this.openDay = openDay;
                return this;
            }

            /**
             * OpenTime.
             */
            public Builder openTime(String openTime) {
                this.openTime = openTime;
                return this;
            }

            /**
             * Poster.
             */
            public Builder poster(String poster) {
                this.poster = poster;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * TrailerList.
             */
            public Builder trailerList(String trailerList) {
                this.trailerList = trailerList;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Movie build() {
                return new Movie(this);
            } 

        } 

    }
    public static class Movies extends TeaModel {
        @NameInMap("Movie")
        private java.util.List < Movie> movie;

        private Movies(Builder builder) {
            this.movie = builder.movie;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Movies create() {
            return builder().build();
        }

        /**
         * @return movie
         */
        public java.util.List < Movie> getMovie() {
            return this.movie;
        }

        public static final class Builder {
            private java.util.List < Movie> movie; 

            /**
             * Movie.
             */
            public Builder movie(java.util.List < Movie> movie) {
                this.movie = movie;
                return this;
            }

            public Movies build() {
                return new Movies(this);
            } 

        } 

    }
}
