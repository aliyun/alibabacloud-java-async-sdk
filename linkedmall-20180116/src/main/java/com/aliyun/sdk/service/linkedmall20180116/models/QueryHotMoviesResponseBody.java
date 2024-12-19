// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link QueryHotMoviesResponseBody} extends {@link TeaModel}
 *
 * <p>QueryHotMoviesResponseBody</p>
 */
public class QueryHotMoviesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("LogsId")
    private String logsId;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Movies")
    private Movies movies;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubCode")
    private String subCode;

    @com.aliyun.core.annotation.NameInMap("SubMessage")
    private String subMessage;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryHotMoviesResponseBody(Builder builder) {
        this.code = builder.code;
        this.logsId = builder.logsId;
        this.message = builder.message;
        this.movies = builder.movies;
        this.requestId = builder.requestId;
        this.subCode = builder.subCode;
        this.subMessage = builder.subMessage;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryHotMoviesResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private String logsId; 
        private String message; 
        private Movies movies; 
        private String requestId; 
        private String subCode; 
        private String subMessage; 
        private Boolean success; 

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

        public QueryHotMoviesResponseBody build() {
            return new QueryHotMoviesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryHotMoviesResponseBody} extends {@link TeaModel}
     *
     * <p>QueryHotMoviesResponseBody</p>
     */
    public static class MovieTypeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MovieTypeList")
        private java.util.List<String> movieTypeList;

        private MovieTypeList(Builder builder) {
            this.movieTypeList = builder.movieTypeList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MovieTypeList create() {
            return builder().build();
        }

        /**
         * @return movieTypeList
         */
        public java.util.List<String> getMovieTypeList() {
            return this.movieTypeList;
        }

        public static final class Builder {
            private java.util.List<String> movieTypeList; 

            /**
             * MovieTypeList.
             */
            public Builder movieTypeList(java.util.List<String> movieTypeList) {
                this.movieTypeList = movieTypeList;
                return this;
            }

            public MovieTypeList build() {
                return new MovieTypeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryHotMoviesResponseBody} extends {@link TeaModel}
     *
     * <p>QueryHotMoviesResponseBody</p>
     */
    public static class TrailerList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TrailerList")
        private java.util.List<String> trailerList;

        private TrailerList(Builder builder) {
            this.trailerList = builder.trailerList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrailerList create() {
            return builder().build();
        }

        /**
         * @return trailerList
         */
        public java.util.List<String> getTrailerList() {
            return this.trailerList;
        }

        public static final class Builder {
            private java.util.List<String> trailerList; 

            /**
             * TrailerList.
             */
            public Builder trailerList(java.util.List<String> trailerList) {
                this.trailerList = trailerList;
                return this;
            }

            public TrailerList build() {
                return new TrailerList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryHotMoviesResponseBody} extends {@link TeaModel}
     *
     * <p>QueryHotMoviesResponseBody</p>
     */
    public static class Movie extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackgroundPicture")
        private String backgroundPicture;

        @com.aliyun.core.annotation.NameInMap("Country")
        private String country;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Director")
        private String director;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("Highlight")
        private String highlight;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("LeadingRole")
        private String leadingRole;

        @com.aliyun.core.annotation.NameInMap("MovieName")
        private String movieName;

        @com.aliyun.core.annotation.NameInMap("MovieNameEn")
        private String movieNameEn;

        @com.aliyun.core.annotation.NameInMap("MovieTypeList")
        private MovieTypeList movieTypeList;

        @com.aliyun.core.annotation.NameInMap("MovieVersion")
        private String movieVersion;

        @com.aliyun.core.annotation.NameInMap("OpenDay")
        private String openDay;

        @com.aliyun.core.annotation.NameInMap("OpenTime")
        private String openTime;

        @com.aliyun.core.annotation.NameInMap("Poster")
        private String poster;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("TrailerList")
        private TrailerList trailerList;

        @com.aliyun.core.annotation.NameInMap("Type")
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
        public MovieTypeList getMovieTypeList() {
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
        public TrailerList getTrailerList() {
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
            private MovieTypeList movieTypeList; 
            private String movieVersion; 
            private String openDay; 
            private String openTime; 
            private String poster; 
            private String remark; 
            private TrailerList trailerList; 
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
            public Builder movieTypeList(MovieTypeList movieTypeList) {
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
            public Builder trailerList(TrailerList trailerList) {
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
    /**
     * 
     * {@link QueryHotMoviesResponseBody} extends {@link TeaModel}
     *
     * <p>QueryHotMoviesResponseBody</p>
     */
    public static class Movies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Movie")
        private java.util.List<Movie> movie;

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
        public java.util.List<Movie> getMovie() {
            return this.movie;
        }

        public static final class Builder {
            private java.util.List<Movie> movie; 

            /**
             * Movie.
             */
            public Builder movie(java.util.List<Movie> movie) {
                this.movie = movie;
                return this;
            }

            public Movies build() {
                return new Movies(this);
            } 

        } 

    }
}
